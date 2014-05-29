package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataaccess.UsuarioDAO;

public class Login {

	public boolean autentica(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{
		
		String usuario = request.getParameter("txtUsuario");
		String senha = request.getParameter("txtSenha");
		
		return new UsuarioDAO().autentica(usuario, senha);
	}
	
	public int idLogado(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{
		
		
		
		return 0;
	}
	
}
