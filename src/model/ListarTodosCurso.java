package model;

import java.util.ArrayList;

import dao.ListarTodosCursoDAO;
import to.CursoTO;

public class ListarTodosCurso {
	public ArrayList<CursoTO> listarCursos(){
		ArrayList<CursoTO> lista;
		ListarTodosCursoDAO dao = new ListarTodosCursoDAO();
		lista = dao.listarCursos();
		return lista;
	}
	public ArrayList<CursoTO> listarCursos(String chave){
		ArrayList<CursoTO> lista;
		ListarTodosCursoDAO dao = new ListarTodosCursoDAO();
		lista = dao.listarCursos(chave);
		return lista;
	}

}
