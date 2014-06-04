<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/adiciona-aluno.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar Aluno</title>
</head>
<body>
	<p id="head">
		<img src="img/pix.png" width="15" height="15"> <span>C</span>adas<span>t</span>ro
	</p>

	<div id="form">
		<form id="formAluno" action="CadastraAluno" method="POST">
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
			<input type="password" name="senha" style="width: 155px" value= required>
			
			<label for="senhaConfirma">Confirmar Senha:</label>
			<input type="password" name="senhaConfirma" style="width: 155px" required>
		
			
			
			<input type="submit" style="font-family: 'visitor_tt1_brkregular'; font-size: larger; color: #00FF00; background-color: #000000; width : 155px;" value="Gravar">
			<a href="login" style="font-family: 'visitor_tt1_brkregular'; font-size: larger; color: #00FF00; background-color: #000000; width : 155px;">Voltar</a>
		</form>
		<!-- <img id="habilton" src="img/habilton.png" style="position: absolute; left: 857px; top: 250px; bottom: 56px; right: 12; width : 42px;"> -->
	</div>

	<a style="display: scroll; position: fixed; bottom: 0px; right: 0px;"
		title="Subir"> <img src="img/habilton.png" border="0" /></a>

</body>
</html>
