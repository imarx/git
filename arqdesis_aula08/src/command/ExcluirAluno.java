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

public class ExcluirAluno implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pSexo = request.getParameter("sexo");
		String pDataNascimento = request.getParameter("dataNascimento");
		String pEndereco = request.getParameter("endereco");
		int pNumero = Integer.parseInt(request.getParameter("numero"));
		String pComplemento = request.getParameter("complemento");
		String pRg = request.getParameter("rg");
		String pCpf = request.getParameter("cpf");
		String pTelefone = request.getParameter("telefone");
		String pEmail = request.getParameter("email");
		String pCodigo = request.getParameter("codigo");
		int codigo = -1;
		try {
			codigo = Integer.parseInt(pCodigo);
		} catch (NumberFormatException e) {

		}

		Aluno aluno = new Aluno(codigo, pNome, pSexo, pDataNascimento, pEndereco, pNumero, pComplemento, pRg, pCpf, pTelefone, pEmail);
		RequestDispatcher view = null;
		HttpSession session = request.getSession();

		aluno.excluir();
		@SuppressWarnings("unchecked")
		ArrayList<AlunoTO> lista = (ArrayList<AlunoTO>) session
				.getAttribute("lista");
		lista.remove(busca(aluno, lista));
		session.setAttribute("lista", lista);
		view = request.getRequestDispatcher("ListarAlunos.jsp");
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
