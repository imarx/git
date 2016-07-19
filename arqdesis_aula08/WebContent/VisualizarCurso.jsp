<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>curso.biz - Visualizar Curso</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <jsp:useBean id="curso" class="to.CursoTO" scope="request" />
    <!-- Modal -->
    <div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="modalLabel">Excluir Curso</h4>
                </div>
                <div class="modal-body">
                    Deseja realmente excluir este curso?
                </div>
                <div class="modal-footer">
                    <form action="ManterCurso.do" method="post">
                        <input type="hidden" name="id" value="${curso.id }" />
                        <button type="submit" class="btn btn-primary" name="acao" value="Excluir">Sim</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- /.modal -->
    <!-- Barra superior com os menus de navegação -->
    <c:import url="menuCurso.jsp" />
    <!-- Container Principal -->
    <div id="main" class="container">
        <h3 class="page-header">Visualizar Curso #${curso.codigo }</h3>
        <div class="row">
            <div class="col-md-12">
                <p><strong>Nome</strong>
                </p>
                <p>
                    ${curso.nome}
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p><strong>Tipo</strong>
                </p>
                <p>
                    ${curso.tipo }
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Data de Inicio</strong>
                </p>
                <p>
                    ${curso.dataDeInicio}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Data de Termino</strong>
                </p>
                <p>
                    ${curso.dataDeTermino}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Horario</strong>
                </p>
                <p>
                    ${curso.horario}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Numero de Vagas</strong>
                </p>
                <p>
                    ${curso.numeroDeVagas}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Valor</strong>
                </p>
                <p>
                    ${curso.valor}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Tipo de Lab</strong>
                </p>
                <p>
                    ${curso.tipoLab}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Softwares</strong>
                </p>
                <p>
                    ${curso.softwares}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Livros</strong>
                </p>
                <p>
                    ${curso.livros}
                </p>
            </div>
            <div class="col-md-6">
                <p><strong>Descricao Material</strong>
                </p>
                <p>
                    ${curso.descricaoMaterial}
                </p>
            </div>
        </div>
        <hr />
        <div id="actions" class="row">
            <div class="col-md-12">
                <a href="ManterCurso.do?acao=Editar&id=${curso.codigo }" class="btn btn-primary">Editar</a>
                <a href="#" class="btn btn-danger" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                <a href="ListarCursos.jsp" class="btn btn-default">Voltar</a>
            </div>
        </div>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>