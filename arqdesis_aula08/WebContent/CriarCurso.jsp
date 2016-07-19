<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>cerveja.biz - Criar Aluno</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Barra superior com os menus de navegacao -->
  	<c:import url="menu.jsp"/>
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Incluir Aluno</h3>
        <!-- Formulario para inclusao de alunos -->
        <form action="ManterAluno.do" method="post">
            <!-- area de campos do form -->
            <div class="row">
                <div class="form-group col-md-12">
                    <label for="nome">Nome</label>
                    <input type="text" class="form-control" name="nome" id="nome" required maxlength="100" placeholder="nome completo">
                </div>
            </div>
            <div class="row">
                <div class="form-group col-md-6">
                    <label for="fone">Tipo</label>
                    <input type="text" class="form-control" name="tipo" id="tipo" required maxlength="100"  placeholder="tipo de curso">
                </div>

                <div class="form-group col-md-6">
                    <label for="fone">Data de Inicio</label>
                    <input type="text" class="form-control" name="dataDeInicio" id="dataDeInicio" maxlength="10"  placeholder="data de inicio ex:(99/99/99)">
                </div>
                
                <div class="form-group col-md-6">
                    <label for="fone">Data de Termino</label>
                    <input type="text" class="form-control" name="dataDeTermino" id="dataDeTermino" maxlength="10"  placeholder="data de termino ex:(99/99/99)">
                </div>
                
                <div class="form-group col-md-6">
                    <label for="fone">Horario</label>
                    <input type="text" class="form-control" name="horario" id="horario" maxlength="10" pattern="(?:\(\d{2}\)|\d{2})[- ]?\d{5}[- ]?\d{4}" placeholder="horario curso ex(00:00)">
                </div>
                
                <div class="form-group col-md-6">
                    <label for="fone">Numero de Vagas</label>
                    <input type="number" class="form-control" name="numeroDeVagas" id="numeroDeVagas" maxlength="10" pattern="(?:\(\d{2}\)|\d{2})[- ]?\d{5}[- ]?\d{4}" placeholder="Numero de Vagas" >
                </div>
                
                <div class="form-group col-md-6">
                    <label for="fone">Valor do curso</label>
                    <input type="number" class="form-control" name="valor" id="valor" maxlength="10" pattern="(?:\(\d{2}\)|\d{2})[- ]?\d{5}[- ]?\d{4}" placeholder="Valor do curso">
                </div>
                
                <div class="form-group col-md-6">
                    <label for="fone">Tipo de Laboratório</label>
                    <input type="text" class="form-control" name="tipoLab" id="tipoLab" maxlength="100" placeholder="tipo de laboratório" >
                </div>
                
                <div class="form-group col-md-6">
                    <label for="fone">Tipo de Laboratório</label>
                    <input type="text" class="form-control" name="tipoLab" id="tipoLab" maxlength="100" placeholder="tipo de laboratório" >
                </div>
                
                <div class="form-group col-md-6">
                    <label for="fone">Softwares</label>
                    <input type="text" class="form-control" name="softwares" id="softwares" maxlength="100"  placeholder="softwares" >
                </div>
                
                 <div class="form-group col-md-6">
                    <label for="fone">Livros</label>
                    <input type="text" class="form-control" name="livros" id="livros" maxlength="100"  placeholder="livros" >
                </div>
                
                <div class="form-group col-md-6">
                    <label for="email">Descrição do Material</label>
                    <input type="text" class="form-control" name="descricaoMaterial" id="descricaoMaterial" required maxlength="100" placeholder="descricao do material" >
                </div>
                
            </div>
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-primary" name="acao" value="Criar">Salvar</button>
                    <a href="index.jsp" class="btn btn-default">Cancelar</a>
                </div>
            </div>
        </form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>