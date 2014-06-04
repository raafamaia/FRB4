<%@page import="dataaccess.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Histórico de Impressão</title>
</head>
<body>
<jsp:useBean id="dao" class="dataaccess.UsuarioDAO"/>
<h1>Usuarios</h1>

	<table align="center">
		<thead>
			<tr>
				<td>Id</td>
				<td>Nome</td>
				<td>Curso</td>
				<td>Periodo</td>
			</tr>
		</thead>
			<!-- FAZER TBODY COM JAVA -->
		<tbody>
			<c:forEach var="usuario" items="${dao.listar}" varStatus="id">
				<tr>
					<td>${usuario.id}</td>
					<td>${usuario.nome}</td>
					<td>${usuario.curso}</td>
					<td>${usuario.periodo}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br><br><a href="home.jsp">Voltar</a>
</body>
</html>