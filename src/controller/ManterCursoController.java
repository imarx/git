package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Curso;
import to.CursoTO;

@WebServlet("/manter_curso.do")
public class ManterCursoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
      String pAcao = request.getParameter("acao");
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

		Curso curso = new Curso(pCodigo, pNome, pTipo, pDataDeInicio, pDataDeTermino, pHorario, pValor, pNumeroDeVagas, pTipoLab, pSoftwares, pLivros, pDescricao);

		if (pAcao.equals("Incluir")) {
			curso.incluir();
		} else if (pAcao.equals("Deletar")) {
			curso.deletar();
		} else if (pAcao.equals("Alterar")) {
			curso.alterar();
		}
		curso.carregar();

		CursoTO to = new CursoTO();
		to.setCodigo(curso.getCodigo());
		to.setNome(curso.getNome());
      to.setTipo(curso.getTipo());
      to.setDataDeInicio(curso.getDataDeInicio());
      to.setDataDeTermino(curso.getDataDeTermino());
      to.getHorario(curso.getHorario());
      to.setValor(curso.getValor());
      to.setNumeroDeVagas(curso.getNumeroDeVagas());
      to.setTipoLab(curso.getTipoLab());   
      to.setSoftwares(curso.getSoftwares());   
      to.setLivros(curso.getLivros());
      to.setDescricaoMaterial(curso.getDescricaoMaterial());
          

		request.setAttribute("curso", to);

		RequestDispatcher view = 
					request.getRequestDispatcher("Curso.jsp");
		view.forward(request, response);

	}

}
