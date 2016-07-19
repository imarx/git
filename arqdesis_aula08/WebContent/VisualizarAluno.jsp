<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>aluno.biz - Visualizar Aluno</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <jsp:useBean id="aluno" class="to.AlunoTO" scope="request" />
    <!-- Modal -->
    <div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="modalLabel">Excluir Aluno</h4>
                </div>
                <div class="modal-body">
                    Deseja realmente excluir este aluno?
                </div>
                <div class="modal-footer">
                    <form action="ManterAluno.do" method="post">
                        <input type="hidden" name="id" value="${aluno.id }" />
                        <button type="submit" class="btn btn-primary" name="acao" value="Excluir">Sim</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- /.modal -->
    <!-- Barra superior com os menus de navegação -->
    <c:import url="Aluno.jsp" />
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Visualizar Aluno #${aluno.id }</h3>
        <div class="row">
            <div class="col-md-12">
                <p><strong>Nome</strong>
                </p>
                <p>
                    ${aluno.nome}
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p><strong>Celular</strong>
                </p>
                <p>
                    ${aluno.fone }
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>E-Mail</strong>
                </p>
                <p>
                    ${aluno.email}
                </p>
            </div>
        </div>
        <hr />
        <div id="actions" class="row">
            <div class="col-md-12">
                <a href="ManterAluno.do?acao=Editar&id=${aluno.id }" class="btn btn-primary">Editar</a>
                <a href="#" class="btn btn-danger" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                <a href="ListarAlunos.jsp" class="btn btn-default">Voltar</a>
            </div>
        </div>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>