package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import dataaccess.UsuarioDAO;

public class AdicionaAluno {

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{

		UsuarioDAO user = new UsuarioDAO();
		Usuario u = new Usuario();

		u.setNome(request.getParameter("nome"));
		u.setRa(Integer.parseInt(request.getParameter("RA")));
		u.setCurso(request.getParameter("curso"));
		u.setPeriodo(request.getParameter("periodo"));
		u.setSenha(request.getParameter("senha"));
		u.setEmail(request.getParameter("email"));

		user.persistManager(u);
	}

}
