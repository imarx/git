package command;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Aluno;
import to.AlunoTO;

public class AlterarAluno implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		Aluno aluno = new Aluno(id, pNome, pNomeM, pRg, pEndereco, pFoneF, pFone, pEmail, pUsuario, pSenha, pPermissao);
		RequestDispatcher view = null;
		HttpSession session = request.getSession();

		aluno.atualizar();
		@SuppressWarnings("unchecked")
		ArrayList<AlunoTO> lista = (ArrayList<AlunoTO>) session
				.getAttribute("lista");
		int pos = busca(aluno, lista);
		lista.remove(pos);
		lista.add(pos, aluno.getTO());
		session.setAttribute("lista", lista);
		request.setAttribute("aluno", aluno.getTO());
		view = request.getRequestDispatcher("VisualizarAluno.jsp");
		view.forward(request, response);
	}

	public int busca(Aluno aluno, ArrayList<AlunoTO> lista) {
		AlunoTO to;
		for (int i = 0; i < lista.size(); i++) {
			to = lista.get(i);
			if (to.getId() == aluno.getId()) {
				return i;
			}
		}
		return -1;
	}

}
