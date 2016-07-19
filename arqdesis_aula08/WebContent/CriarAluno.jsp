<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Criar Aluno</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Barra superior com os menus de navegacao -->
  	<c:import url="Aluno.jsp"/>
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Incluir Aluno</h3>
        <!-- Formulario para inclusao de alunos -->
        <form action="ManterAluno.do" method="post">
            <!-- area de campos do form -->
            <div class="row">
                <div class="form-group col-md-6">
                    <label for="sexo">Sexo</label>
                    <input type="text" class="form-control" name="sexo" id="sexo" maxlength="15" placeholder="Informe seu sexo." value="${aluno.sexo}">
                </div>

                <div class="form-group col-md-6">
                    <label for="dataNascimento">Data de Nascimento</label>
                    <input type="date" class="form-control" name="dataNascimento" id="dataNascimento" required maxlength="8" pattern="(?:\d{2}\d{2}\)[- ]?\d{5}[- ]?\d{4}"  placeholder="Obrigatório; formato dd/mm/aaaa" value="${aluno.dataNascimento}">
                </div>
                <div class="form-group col-md-6">
                    <label for="endereco">Endereço</label>
                    <input type="text" class="form-control" name="endereco" id="endereco" maxlength="100" placeholder="Endereço da residencia" value="${aluno.endereco}">
                </div>
                <div class="form-group col-md-6">
                    <label for="numero">Número</label>
                    <input type="number" class="form-control" name="numero" id="numero" required maxlength="10" placeholder="Número de sua casa" value="${aluno.email}">
                </div>
                <div class="form-group col-md-6">
                    <label for="complemento">Complemento</label>
                    <input type="complemento" class="form-control" name="email" id="email" required maxlength="60" placeholder="email obrigatório" value="${aluno.email}">
                </div>
                <div class="form-group col-md-6">
                    <label for="email">E-Mail</label>
                    <input type="email" class="form-control" name="email" id="email" required maxlength="60" placeholder="email obrigatório" value="${aluno.email}">
                </div>
            </div>
        </form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>