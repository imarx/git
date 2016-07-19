package model;

import to.ListaDeAlunos;
import dao.ListarTodosAlunoDAO;

public class ListarTodosAluno {
	public ListaDeAlunos listarAlunos(){
		ListaDeAlunos lista;
		ListarTodosAlunoDAO dao = new ListarTodosAlunoDAO();
		lista = dao.listarAlunos();
		return lista;
	}
	public ListaDeAlunos listarAlunos(String chave){
		ListaDeAlunos lista;
		ListarTodosAlunoDAO dao = new ListarTodosAlunoDAO();
		lista = dao.listarAlunos(chave);
		return lista;
	}

}
