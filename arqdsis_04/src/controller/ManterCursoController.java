package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Curso;

@WebServlet("/manter_curso.do")
public class ManterCursoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		int pCodigo = Integer.parseInt(request.getParameter("Codigo"));
		
		Curso curso = new Curso(pCodigo, pNome, pTipo, pDataDeInicio, pDataDeTermino, pHorario, pValor, pNumeroDeVagas, pTipoLab, pSoftwares, pLivros, pDescricao);
		curso.incluir();
		curso.carregar();
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
	}

}