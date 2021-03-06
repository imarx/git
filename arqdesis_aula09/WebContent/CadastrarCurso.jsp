<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<title> Cursos </title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
</head>
<body>

 <!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp"/>

<!-- container principal -->
	<div id="main" class="container">
		<h2>Cadastro de Cursos</h2><br><br>
				
		<form action="controller.do" method = "post">     <!--coloca o .do para indicar que faz algo  --> 

	  	  
	  <div class="row">
	  
	  	<div class="form-group col-md-6">
			<label for="nome" >Tipo: </label><br>
				<select id="tipo" name="tipo" class="form-control"  onchange="ChamarLink();">
					<option value="">Selecione...</option>
					<option value="Creche">Creche</option>
					<option value="Graduação">Graduação</option>
					<option value="Pós-Graduação">Pós-Graduação</option>
				</select>
		</div>
    
		<div class="form-group col-md-6">
			<label for="nome" >Nome: </label><br>
			<input type="text" class="form-control" name="nome" size="40" maxlength="30" placeholder="nome">
		</div>
	
		<div class="form-group col-md-6">
			<label for="dataIni" >Data início: </label><br> 
			<input type="text" class="form-control" name="dataIni" size="40" maxlength="20" placeholder="data início">
		</div>
	
		<div class="form-group col-md-6">
			<label for="dataTerm" >Data término: </label><br>
			<input type="text" class="form-control" name="dataTerm" size="40" maxlength="20" placeholder="data de término">
		</div>
		
		<div class="form-group col-md-6">
			<label for="horario" >Horário: </label><br> 
			<input type="text" class="form-control" name="horario" size="40" maxlength="10" placeholder="horário">
		</div>
			
		<div class="form-group col-md-6">
			<label for="numVagas" >Número de vagas: </label><br>
		 	<input type="text" class="form-control" name="numVagas" size="40" maxlength="10" placeholder="número de vagas">
		</div>
			
			
		<div class="form-group col-md-6">
			<label for="valor" >Valor: </label><br>
			<input type="text" class="form-control" name="valor" size="40" maxlength="10" placeholder="preço mensal">
		</div>
	
		
		<div class="form-group col-md-6">
			<label for="disp" >Disponibilidade: </label><br> 
			<input type="text" class="form-control" name="disp" size="40" maxlength="20" placeholder="Disponível ou Indisponível">
		</div>
			</div><br><br>
			 
			<div class="row">
			<div class="form-group col-md-6">
			<button type="submit"  name="command" value="CadastrarCurso" class="btn btn-primary">Cadastrar
    			<span class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span> 
    		</button>
    		
    		<a href="ListarCurso.jsp" class="btn btn-default btn-default  active"> Cancelar 
    		<span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 	
 			</a>
			 </div>
	 	</div>
    
</form>   

    
</div>     
</body>
</html>
