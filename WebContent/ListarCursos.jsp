<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page import="java.util.ArrayList, to.CursoTO" %>
        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="wcodigoth=device-wcodigoth, initial-scale=1">
            <title>Buscar Cursos</title>

            <link href="css/bootstrap.min.css" rel="stylesheet">
            <link href="css/style.css" rel="stylesheet">

        </head>

        <body>
            <!-- Modal -->
            <div class="modal fade" codigo="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hcodigoden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" codigo="modalLabel">Excluir Curso</h4>
                        </div>
                        <div class="modal-body">
                            Deseja realmente excluir este curso?
                        </div>
                        <div class="modal-footer">
                            <form action="ManterCurso.do" method="post">
                                <input type="hcodigoden" name="codigo" codigo="codigo_excluir" />
                                <button type="submit" class="btn btn-primary" name="acao" value="Excluir">Sim</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.modal -->
            <!-- Barra superior com os menus de navegação -->
            <nav class="navbar navbar-inverse navbar-fixed-top">
                <div class="container-flucodigo">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="index.html">cerveja.biz</a>
                    </div>
                    <div codigo="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="listar_cursos.html">Cursos</a>
                            </li>
                            </ul>
                    </div>
                </div>
            </nav>
            <!-- Container Principal -->
            <div codigo="main" class="container-flucodigo">
                <form action="listar_cursos.do" method="post">
                    <div codigo="top" class="row">
                        <div class="col-md-3">
                            <h2>Cursos</h2>
                        </div>

                        <div class="col-md-6">
                            <div class="input-group h2">
                                <input name="data[search]" class="form-control" codigo="search" type="text" placeholder="Pesquisar Cursos (deixe vazio para trazer todos)">
                                <span class="input-group-btn">
                <button class="btn btn-primary" type="submit">
                    <span class="glyphicon glyphicon-search"></span>
                                </button>
                                </span>
                            </div>
                        </div>

                        <div class="col-md-3">
                            <a href="criar_curso.html" class="btn btn-primary pull-right h2">Novo Curso</a>
                        </div>
                    </div>
                    <!-- /#top -->
                </form>
                <hr />
                <div codigo="list" class="row">

                    <div class="table-responsive col-md-12">
                        <table class="table table-striped" cellspacing="0" cellpadding="0">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Nome</th>
                                    <th>Tipo</th>
                                    <th>Data de Inicio</th>
                                    <th>Data de Termino</th>
                                    <th>Horario</th>
                                    <th>Valor</th>
                                    <th>Numero de Vagas</th>
                                    <th>Tipo Lab</th>
                                    <th>Software</th>
                                    <th>Livros</th>
                                    <th>Descricao Material</th>
                                    <th class="actions">Ações</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% ArrayList<CursoTO>lista = (ArrayList
                                    <CursoTO>)request.getAttribute("lista"); for(CursoTO to:lista){ %>
                                   <tr>
                                   
                                   this.codigo = codigo;

                                            <td>
                                                <%=to.getCodigo()%>
                                            </td>
                                            <td>
                                                <%=to.getNome() %>
                                            </td>
                                            <td>
                                                <%=to.getTipo() %>
                                            </td>
                                            <td>
                                                <%=to.getDataDeInicio() %>
                                            </td>
                                            <td>
                                                <%=to.getDataDeTermino() %>
                                            </td>
                                            <td>
                                                <%=to.getHorario() %>
                                            </td>
                                            <td>
                                                <%=to.getValor() %>
                                            </td>
                                            <td>
                                                <%=to.getNumeroDeVagas() %>
                                            </td>
                                            <td>
                                                <%=to.getTipoLab() %>
                                            </td>
                                            <td>
                                                <%=to.getSoftware() %>
                                            </td>
                                            <td>
                                                <%=to.getLivros() %>
                                            </td>
                                            <td>
                                                <%=to.getDescricaoMaterial() %>
                                            </td>
                                            <td class="actions">
                                                <a class="btn btn-success btn-xs" href="ManterCurso.do?acao=Visualizar&codigo=<%=to.getCodigo()%>">Visualizar</a>
                                                <a class="btn btn-warning btn-xs" href="ManterCurso.do?acao=Editar&codigo=<%=to.getCodigo()%>">Editar</a>
                                                <button codigo="btn<%=to.getCodigo()%>" type="button" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#delete-modal" data-curso="<%=to.getCodigo()%>">Excluir</button>
                                            </td>
                                        </tr>
                                        <% } %>

                            </tbody>
                        </table>

                    </div>
                </div>
                <!-- /#list -->

                <div codigo="bottom" class="row">
                    <div class="col-md-12">
                        <!-- paginação ainda não foi implementada -->
                        <ul class="pagination">
                            <li class="disabled"><a>&lt; Anterior</a>
                            </li>
                            <li class="disabled"><a>1</a>
                            </li>
                            <li><a href="#">2</a>
                            </li>
                            <li><a href="#">3</a>
                            </li>
                            <li class="next"><a href="#" rel="next">Próximo &gt;</a>
                            </li>
                        </ul>
                        <!-- /.pagination -->

                    </div>
                </div>
                <!-- /#bottom -->
            </div>
            <!-- /#main -->
            <script src="js/jquery.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script type="text/javascript">
                $("#delete-modal").on('show.bs.modal', function(event) {
                    var button = $(event.relatedTarget); //botao que disparou a modal
                    var recipient = button.data('curso');
                    $("#codigo_excluir").val(recipient);
                });
            </script>
        </body>

        </html>