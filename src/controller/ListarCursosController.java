package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ListarTodosCurso;
import to.CursoTO;

/**
 * Servlet implementation class ListarCursosController
 */
@WebServlet("/listar_cursos.do")
public class ListarCursosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String chave = request.getParameter("data[search]");
			ListarTodosCurso listarTodosCurso = new ListarTodosCurso();
			ArrayList<CursoTO> lista;
			if(chave != null && chave.length() > 0){
				lista = listarTodosCurso.listarCursos(chave);
			} else {
				lista = listarTodosCurso.listarCursos();
			}
			request.setAttribute("lista", lista);
		RequestDispatcher dispatcher = request.
				getRequestDispatcher("ListarCursos.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
