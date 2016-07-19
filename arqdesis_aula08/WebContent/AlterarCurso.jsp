<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Alterar Curso</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <jsp:useBean id="curso" class="to.CursoTO" scope="request" />
    <!-- Barra superior com os menus de navegação -->
    <c:import url="menuCurso.jsp" />
    <!-- Container Principal -->
   <div id="main" class="container">
        <h3 class="page-header">Alterar Curso #${curso.codigo}</h3>
        <!-- Formulario para alteração de cursos -->
       <form action="ManterCurso.do" method="post">
            <!-- area de campos do form -->
             <input type="hidden" name="id" value="${curso.codigo}"/>
              <div class="row">
                <div class="form-group col-md-12">
                    <label for="nome">Nome</label>
                    <input type="text" class="form-control" name="nome" id="nome" required maxlength="100" placeholder="nome completo" value="${curso.nome}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Tipo</label>
                    <input type="text" class="form-control" name="tipo" id="tipo" required maxlength="100"  placeholder="tipo de curso" value="${curso.tipo}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Data de Inicio</label>
                    <input type="text" class="form-control" name="dataDeInicio" id="dataDeInicio" maxlength="10"  placeholder="data de inicio ex:(99/99/99)" value="${curso.dataDeInicio}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Data de Termino</label>
                    <input type="text" class="form-control" name="dataDeTermino" id="dataDeTermino" maxlength="10"  placeholder="data de termino ex:(99/99/99)" value="${curso.dataDeTermino}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Horario</label>
                    <input type="text" class="form-control" name="horario" id="horario" maxlength="10" pattern="(?:\(\d{2}\)|\d{2})[- ]?\d{5}[- ]?\d{4}" placeholder="horario curso ex(00:00)" value="${curso.horario}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Numero de Vagas</label>
                    <input type="number" class="form-control" name="numeroDeVagas" id="numeroDeVagas" maxlength="10" pattern="(?:\(\d{2}\)|\d{2})[- ]?\d{5}[- ]?\d{4}" placeholder="Numero de Vagas" value="${curso.numeroDeVagas}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Valor do curso</label>
                    <input type="number" class="form-control" name="valor" id="valor" maxlength="10" pattern="(?:\(\d{2}\)|\d{2})[- ]?\d{5}[- ]?\d{4}" placeholder="Valor do curso" value="${curso.valor}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Tipo de Laboratório</label>
                    <input type="text" class="form-control" name="tipoLab" id="tipoLab" maxlength="100" placeholder="tipo de laboratório" value="${curso.tipoLab}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Tipo de Laboratório</label>
                    <input type="text" class="form-control" name="tipoLab" id="tipoLab" maxlength="100" placeholder="tipo de laboratório" value="${curso.tipoLab}">
                </div>
                <div class="form-group col-md-6">
                    <label for="fone">Softwares</label>
                    <input type="text" class="form-control" name="softwares" id="softwares" maxlength="100"  placeholder="softwares" value="${curso.softwares}">
                </div>
                 <div class="form-group col-md-6">
                    <label for="fone">Livros</label>
                    <input type="text" class="form-control" name="livros" id="livros" maxlength="100"  placeholder="livros" value="${curso.livros}">
                </div>
                <div class="form-group col-md-6">
                    <label for="email">Descrição do Material</label>
                    <input type="text" class="form-control" name="descricaoMaterial" id="descricaoMaterial" required maxlength="100" placeholder="descricao do material" value="${curso.descricaoMaterial}">
                </div>
              </div>
            <hr/>
            <div id="actions" class="row">
                <div class="col-md-12">
                    <button type="submit" class="btn btn-primary" name="acao" value="Alterar">Salvar</button>
                    <a href="ListarCursos.jsp" class="btn btn-default">Cancelar</a>
                </div>
            </div>
        </form>
     </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>