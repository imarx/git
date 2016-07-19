package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ListarTodosCurso;
import to.CursoTO;

public class ListarCursosBuscar implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String chave = request.getParameter("data[search]");
		ListarTodosCurso listarTodosCurso = new ListarTodosCurso();
		ArrayList<CursoTO> lista = null;
		HttpSession session = request.getSession();

		if (chave != null && chave.length() > 0) {
			lista = listarTodosCurso.listarCursos(chave);
		} else {
			lista = listarTodosCurso.listarCursos();
		}
		session.setAttribute("lista", lista);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("ListarCursos.jsp");
		dispatcher.forward(request, response);
	}
}
