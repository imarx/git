package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Curso;
import to.CursoTO;

public class CriarCurso implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pCodigo = request.getParameter("codigo");
		String pNome = request.getParameter("nome");
	    String pTipo = request.getParameter("tipo");
	    String pDataDeInicio = request.getParameter("dataDeInicio");
	    String pDataDeTermino = request.getParameter("dataDeTermino");
	    String pHorario = request.getParameter("horario");
	    int pValor = Integer.parseInt(request.getParameter("Valor"));
	    int pNumeroDeVagas = Integer.parseInt(request.getParameter("numeroDeVagas"));
	    String pTipoLab = request.getParameter("tipoLab");
	    String pSoftwares = request.getParameter("softwares");
	    String pLivros = request.getParameter("livros");
	    String pDescricao = request.getParameter("descricao");
		int codigo = -1;
		try {
			codigo = Integer.parseInt(pCodigo);
		} catch (NumberFormatException e) {

		}

		Curso curso = new Curso( codigo, pNome, pTipo, pDataDeInicio, pDataDeTermino, pHorario, pValor, pNumeroDeVagas, pTipoLab, pSoftwares, pLivros, pDescricao);
		HttpSession session = request.getSession();

		curso.criar();
		ArrayList<CursoTO> lista = new ArrayList<>();
		lista.add(curso.getTO());
		session.setAttribute("lista", lista);
		RequestDispatcher view =  request.getRequestDispatcher("ListarCursos.jsp");
		view.forward(request, response);
	}
}
