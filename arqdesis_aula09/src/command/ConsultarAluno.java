package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;

public class ConsultarAluno implements Command {


	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pId = request.getParameter("id");
		String pNome = request.getParameter("nome");
		String pNomeM = request.getParameter("nomeM");
		String pRg = request.getParameter("rg");
		String pEndereco = request.getParameter("endereco");
		String pFoneF = request.getParameter("foneF");
		String pFone = request.getParameter("fone");
		String pEmail = request.getParameter("email");
		String pUsuario = request.getParameter("usuario");
		String pSenha = request.getParameter("senha");
		String pPermissao = request.getParameter("permissao");
		int id = -1;
		try {
			id = Integer.parseInt(pId);
		} catch (Exception e) {

		}

		Aluno aluno = new Aluno (id, pNome, pFone, pRg, pNomeM, pFoneF, pEndereco, pEmail, pUsuario, pSenha, pPermissao);
		RequestDispatcher view = null;

		aluno.carregar();
		request.setAttribute("alunoTO", aluno.getTO());
		view = request.getRequestDispatcher("VisualizarAluno.jsp");		


		view.forward(request, response);

	}
}
