package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import to.AlunoTO;

@WebServlet("/manter_aluno.do")
public class ManterAlunoController extends HttpServlet {
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
		String pSexo = request.getParameter("sexo");
		String pDataNascimento = request.getParameter("dataNascimento");
		String pEndereco = request.getParameter("endereco");
		int pNumero = Integer.parseInt(request.getParameter("numero"));
		String pComplemento = request.getParameter("complemento");
		String pRg = request.getParameter("rg");
		String pCpf = request.getParameter("cpf");
		String pTelefone = request.getParameter("telefone");
		String pEmail = request.getParameter("email");
		int codigo = -1;
		try {
			codigo = Integer.parseInt(pCodigo);
		} catch (NumberFormatException e) {

		}

		Aluno aluno = new Aluno(pCodigo, pNome, pSexo, pDataNascimento, pEndereco, pNumero, pComplemento, pRg, pCpf, pTelefone, pEmail);

		if (pAcao.equals("Incluir")) {
			aluno.incluir();
		} else if (pAcao.equals("Deletar")) {
			aluno.deletar();
		} else if (pAcao.equals("Alterar")) {
			aluno.alterar();
		}
		aluno.carregar();

		AlunoTO to = new AlunoTO();
		to.setCodigo(aluno.getCodigo());
		to.setNome(aluno.getNome());
      to.setSexo(aluno.getSexo());
      to.setdataNascimento(aluno.getdataNascimento());
      to.setEndereco(aluno.getEndereco());
      to.setNumero(aluno.getNumero());
      to.setComplemento(aluno.getComplemento());
      to.setFone(aluno.getFone());
      to.setEmail(aluno.getEmail());   
      to.setRg(aluno.getRg());   
      to.setCPF(aluno.getCPF());

		request.setAttribute("aluno", to);

		RequestDispatcher view = 
					request.getRequestDispatcher("Aluno.jsp");
		view.forward(request, response);

	}

}
