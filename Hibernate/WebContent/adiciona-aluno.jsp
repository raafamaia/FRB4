<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/adiciona-aluno.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<title>Adicionar Aluno</title>
</head>
<body>
	<p id="head">
		<img src="img/pix.png" width="15" height="15"> <span>${titulo}</span>
	</p>

	<div id="form">
		<form id="formAluno" action="cadastro" method="POST">
			
			<p>${param.nome} ${msg}</p>
			
			<label for="nome">Usuário: </label>
			<input type="text" name="nome" style="width: 155px" required>
			
			<label for="RA">RA: </label>
			<input type="text" name="RA" style="width: 155px" required>
			
			<label for="periodo">Periodo: </label>
			<input type="text" name="periodo" style="width: 155px" required>
			
			<label for="curso">Curso: </label>
			<input type="text" name="curso" style="width: 155px" required>

			<label for="email">Email: </label>
			<input type="text" name="email" style="width: 155px" required>
			
			<label for="senha">Senha: </label>
			<input type="password" name="senha" id="campoSenha" style="width: 155px" required>
			
			<label for="senhaConfirma">Confirmar Senha:</label>
			<input type="password" name="senhaConfirma" id="campoSenhaConfirma" style="width: 155px" required>
			
			<span id="confereSenha"></span>
		
			<input type="submit" disabled id="submit" style="font-family: 'visitor_tt1_brkregular'; font-size: larger; color: #00FF00; background-color: #000000; width : 155px;" value="Gravar">
			
			<%if (request.getAttribute("titulo").equals("Cadastro")){%>
				<a href="login" style="font-family: 'visitor_tt1_brkregular'; font-size: larger; color: #00FF00; background-color: #000000; width : 155px;">Voltar</a>
			<%}else if(request.getAttribute("titulo").equals("Editar")){%>
				<a href="home" style="font-family: 'visitor_tt1_brkregular'; font-size: larger; color: #00FF00; background-color: #000000; width : 155px;">Voltar</a>
			<%} %>
			
			
			
		</form>
		<!-- <img id="habilton" src="img/habilton.png" style="position: absolute; left: 857px; top: 250px; bottom: 56px; right: 12; width : 42px;"> -->
	</div>

	<a style="display: scroll; position: fixed; bottom: 0px; right: 0px;"
		title="Subir"> <img src="img/habilton.png" border="0" /></a>
	<script>
		function confere () {
		    if($('#campoSenha').val() == $('#campoSenhaConfirma').val()){
		        $('#confereSenha').text('Senha iguais');
		        $('#submit').removeProp('disabled');
		    }else{
		        $('#confereSenha').text('Senhas não equivalentes!');
		        $('#submit').prop('disabled', true);
		    }
		}
		$('#campoSenha').on('keyup', confere);
		$('#campoSenhaConfirma').on('keyup', confere);
	</script>
</body>
</html>
