package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ManterCurso;
import to.CursoTO;

public class CadastrarCurso implements Command {
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		CursoTO infoTO = new CursoTO();
		
 		String pCodigo = request.getParameter("codigo");
 		infoTO.setTipo(request.getParameter("tipo"));
		infoTO.setNome(request.getParameter("nome"));
		infoTO.setDataInicio(request.getParameter("dataIni")); // nome do parametro do formulário 
		infoTO.setDataTermino(request.getParameter("dataTerm"));
		infoTO.setHorario(request.getParameter("horario")); // nome do parametro do formulário 
		infoTO.setNumeroVagas(request.getParameter("numVagas"));
		infoTO.setValor(request.getParameter("valor")); // nome do parametro do formulário 
		infoTO.setDisponibilidade(request.getParameter("disp"));
		int codigo = -1;
		try {
			codigo = Integer.parseInt(pCodigo);
			infoTO.setCodigo(codigo);
		} catch (NumberFormatException e) {
			System.out.println("erro:" + e.getMessage());
		}

		ManterCurso manterCurso = new ManterCurso(infoTO);
		
		HttpSession session = request.getSession(); // aqui estamos inicializando uma seção, com nome de session

		manterCurso.cadastrar();
		ArrayList<CursoTO> lista = new ArrayList<>();
		lista.add(manterCurso.getTO());
		session.setAttribute("lista", lista);
		RequestDispatcher view = request.getRequestDispatcher("ListarCurso.jsp");		
		view.forward(request, response);
		
	}
}
