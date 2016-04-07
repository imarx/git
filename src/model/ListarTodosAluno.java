package model;

import java.util.ArrayList;

import dao.ListarTodosAlunoDAO;
import to.AlunoTO;

public class ListarTodosAluno {
	public ArrayList<AlunoTO> listarAlunos(){
		ArrayList<AlunoTO> lista;
		ListarTodosAlunoDAO dao = new ListarTodosAlunoDAO();
		lista = dao.listarAlunos();
		return lista;
	}
	public ArrayList<AlunoTO> listarAlunos(String chave){
		ArrayList<AlunoTO> lista;
		ListarTodosAlunoDAO dao = new ListarTodosAlunoDAO();
		lista = dao.listarAlunos(chave);
		return lista;
	}

}
