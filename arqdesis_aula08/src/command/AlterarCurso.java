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

public class AlterarCurso implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		HttpSession session = request.getSession();

		curso.atualizar();
		@SuppressWarnings("unchecked")
		ArrayList<CursoTO> lista = (ArrayList<CursoTO>) session.getAttribute("lista");
		int pos = busca(curso, lista);
		lista.remove(pos);
		lista.add(pos, curso.getTO());
		session.setAttribute("lista", lista);
		request.setAttribute("curso", curso.getTO());
		view = request.getRequestDispatcher("VisualizarCurso.jsp");
		view.forward(request, response);
	}

	public int busca(Curso curso, ArrayList<CursoTO> lista) {
		CursoTO to;
		for (int i = 0; i < lista.size(); i++) {
			to = lista.get(i);
			if (to.getCodigo() == curso.getCodigo()) {
				return i;
			}
		}
		return -1;
	}

}
