<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">cerveja.biz</a>
                <img alt="marca" src="img/cerveja.png">
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="ListarAlunos.jsp">Alunos</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cervejas<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Marca</a>
                            </li>
                            <li><a href="#">Cor</a>
                            </li>
                            <li><a href="#">Estilo</a>
                            </li>
                            <li><a href="#">País</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>