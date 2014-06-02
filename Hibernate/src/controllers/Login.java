package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import dataaccess.UsuarioDAO;

public class Login {

	public boolean autentica(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{
		
		UsuarioDAO userDao = new UsuarioDAO();
		
		String usuario = request.getParameter("txtUsuario");
		String senha = request.getParameter("txtSenha");
		
		for(Usuario user: userDao.listar()){
			if (user.getNome().equals(usuario) && user.getSenha().equals(senha)) {
				return true;
			}
		}
		
		return false;
	}
	
	public int idLogado(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{
		
		
		
		return 0;
	}
	
}
