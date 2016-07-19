package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import to.AlunoTO;
import to.ListaDeAlunos;
import factory.ConnectionFactory;

public class ListarTodosAlunoDAO {

	public ListaDeAlunos listarAlunos() {
		AlunoTO to;
		ArrayList<AlunoTO> lista = new ArrayList<>();
		String sqlSelect = "SELECT * FROM aluno";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while(rs.next()) {
					to = new AlunoTO();
					to.setCodigo(rs.getInt("codigo"));
					to.setNome(rs.getString("nome"));
	                to.setSexo(rs.getString("sexo"));
	                to.setDataNascimento(rs.getString("dataNascimento"));
	                to.setEndereco(rs.getString("endereco"));
	                to.setNumero(rs.getInt("numero"));
	                to.setComplemento(rs.getString("complemento"));
					to.setFone(rs.getString("fone"));
	                to.setEmail(rs.getString("email"));
	                to.setRG(rs.getString("rg"));
	                to.setCPF(rs.getString("cpf"));
					lista.add(to);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		ListaDeAlunos ldc = new ListaDeAlunos();
		ldc.setAlunos(lista);
		return ldc;
	}
	
	public ListaDeAlunos listarAlunos(String chave) {
		AlunoTO to;
		ArrayList<AlunoTO> lista = new ArrayList<>();
		String sqlSelect = "SELECT * FROM aluno where upper(nome) like ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setString(1, "%" + chave.toUpperCase() + "%");
			try (ResultSet rs = stm.executeQuery();) {
				while(rs.next()) {
					to = new AlunoTO();
					to.setCodigo(rs.getInt("codigo"));
					to.setNome(rs.getString("nome"));
               to.setSexo(rs.getString("sexo"));
               to.setDataNascimento(rs.getString("dataNascimento"));
               to.setEndereco(rs.getString("endereco"));
               to.setNumero(rs.getInt("numero"));
               to.setComplemento(rs.getString("complemento"));
					to.setFone(rs.getString("fone"));
               to.setEmail(rs.getString("email"));
               to.setRG(rs.getString("rg"));
               to.setCPF(rs.getString("cpf"));
					lista.add(to);
               }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		ListaDeAlunos ldc = new ListaDeAlunos();
		ldc.setAlunos(lista);
		return ldc;
	}

}
