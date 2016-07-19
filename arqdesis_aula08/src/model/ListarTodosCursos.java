package model;

import to.ListaDeCursos;
import dao.ListarTodosCursosDAO;


public class ListarTodosCursos {
	public ListaDeCursos listarCursos(){
		ListaDeCursos lista;
		ListarTodosCursosDAO dao = new ListarTodosCursosDAO();
		lista = dao.listarCursos();
		return lista;
	}
	public ListaDeCursos listarCursos(String chave){
		ListaDeCursos lista;
		ListarTodosCursosDAO dao = new ListarTodosCursosDAO();
		lista = dao.listarCursos(chave);
		return lista;
	}

}
