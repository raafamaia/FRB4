<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/login.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<p class="head"><span>S</span>istema <span>de</span> Geren<span>c</span>iamento de <span>X</span>erox</p>

<br>

<fieldset id="form">
	<legend>Log In</legend>
	<br/>
	<form action="login" method="POST">
		<label for="txtUsuario">Usuário</label> 
		<input type="text" name="txtUsuario">
		<label for="txtSenha">Senha</label>
		<input type="password" name="txtSenha"> <br/> 
		<br/>
		
		<input type="submit" style="font-family: 'visitor_tt1_brkregular'; font-size: larger; color: #00FF00; background-color: #000000; width : 155px;" value="Login"> <br>
	</form>
	<p> ou </p>
	<a class="head" href="cadastro" style="font-size: 20px;">Cadastrar<span>-</span>se</a>
	<p>${erro}</p>

</fieldset>
<fieldset id="rodape">
	<legend>Quem somos</legend>
	<p>Projeto Sistema de Xerox - Laboratório de Programação</p>
</fieldset>
</body>
</html>