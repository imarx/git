<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="to.AlunoTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aluno</title>
</head>
<body>
	<%AlunoTO to = (AlunoTO)request.getAttribute("aluno"); %>
	Codigo: <%=to.getCodigo() %><br>
	Nome: <%=to.getNome() %><br>
	Sexo: <%=to.getSexo() %><br>
	Data de Nascimento: <%=to.getDataNascimento() %><br>
	Endereco: <%=to.getEndereco() %><br>
	Numero: <%=to.getNumero() %><br>
	Complemento: <%=to.getComplemento() %><br>
	Fone: <%=to.getFone() %><br>
	RG: <%=to.getRg() %><br>
	CPF: <%=to.getCPF() %><br>
	Email: <%=to.getEmail() %><br>
		
</body>
</html>