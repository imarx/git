package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Curso;
import model.Curso;

public class EditarCurso implements Command {

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
		RequestDispatcher view = null;

		curso.carregar();
		request.setAttribute("curso", curso.getTO());
		view = request.getRequestDispatcher("AlterarCurso.jsp");

		view.forward(request, response);

	}
}
