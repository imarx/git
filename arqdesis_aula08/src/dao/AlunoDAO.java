package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import to.AlunoTO;
import factory.ConnectionFactory;

public class AlunoDAO {
	
	public void incluir(AlunoTO to) {
		String sqlInsert = "Insert Into aluno (nome, sexo, dataNascimento, endereco, numero, complemento, telefone, email, rg, cpf) values (?,?,?,?,?,?,?,?,?,?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, to.getCodigo());
			stm.setString(2, to.getNome());
			stm.setString(3, to.getSexo());
			stm.setString(4, to.getDataNascimento());
	        stm.setString(5, to.getEndereco());
	        stm.setInt(6, to.getNumero());
	        stm.setString(7, to.getComplemento());
	        stm.setString(8, to.getFone());
	        stm.setString(9, to.getEmail());
	        stm.setString(10, to.getRG());
	        stm.setString(11, to.getCPF());
			stm.execute();
			String sqlSelect = "SELECT LAST_INSERT_ID()";
			try(PreparedStatement stm1 = conn.prepareStatement(sqlSelect);
					ResultSet rs = stm1.executeQuery();){
					if(rs.next()){
						to.setCodigo(rs.getInt(1));
					}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void alterar(AlunoTO to) {
		 String sqlUpdate = "update aluno set nome = ?, sexo = ?, dataNascimento = ?, endereco = ?, numero = ?, complemento = ?, telefone = ?, email = ?, rg = ?, cpf = ? where codigo = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, to.getNome());
	        stm.setString(2, to.getSexo());
	        stm.setString(3, to.getDataNascimento());
	        stm.setString(4, to.getEndereco());
	        stm.setInt(5, to.getNumero());
	        stm.setString(6, to.getComplemento());
	        stm.setString(7, to.getFone());
	        stm.setString(8, to.getEmail());
	        stm.setString(9, to.getRG());
	        stm.setString(10, to.getCPF());
	        stm.setInt(11, to.getCodigo());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletar(AlunoTO to) {
		String sqlDelete = "DELETE FROM aluno WHERE codigo = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, to.getCodigo());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public AlunoTO carregar(int codigo) {
		AlunoTO to = new AlunoTO();
		String sqlSelect = "SELECT * FROM aluno WHERE aluno.codigo = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, codigo);
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
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
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return to;
	}
}
