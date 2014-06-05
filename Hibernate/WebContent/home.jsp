<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto X</title>
<link type="text/css" rel="stylesheet" href="css/telaPrincipal.css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

</head>
<body>
	<div>
		<p id="head">M<span>e</span>nu <span>p</span>rincipal</p>
		${username}
		<!-- ID DO USUÁRIO LOGADO <input type="hidden" value="<%  %>"/> -->
		${upload}
		<ul>
			<li>
				<a href="#" id="enviarArquivo" onclick="formEnviar">Enviar Arquivo</a>
				<div id="enviarDiv">
					<form id="formFile" method="post" action="InsertFile" enctype="multipart/form-data">
						<input type="file" name="procurarDoc">
						<input type="submit" name="upload" value="Enviar">
					</form>
				</div>
			</li>
			<li><a href="#">Fila de Arquivos</a></li>
			<li><a href="historico-impressao.jsp">Histórico de impressão</a></li>
			<li><a href="#">Informações da conta</a></li>
			<li><a href="editar">Editar Perfil</a></li>
			<li><a href="logout">Sair</a></li>
		</ul>
	</div>
	 <script>
	 	$("#enviarDiv").hide();
	 	$("#enviarArquivo").on('click', function(){
		 	$("#enviarDiv").toggle();
	 	});
	</script> 
	<p id="head">
	<a style="display: scroll; position: fixed; bottom: 0px; right: 0px;" title="Subir"> <img src="img/habilton.png" border="0" /></a>
</body>
</html>