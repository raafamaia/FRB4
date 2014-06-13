package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conta;
import model.Usuario;
import dataaccess.UsuarioDAO;

public class AdicionaUsuario {

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{

		UsuarioDAO userDao = new UsuarioDAO();
		Usuario u = new Usuario();

		u.setNome(request.getParameter("nome"));
		u.setRa(Integer.parseInt(request.getParameter("RA")));
		u.setCurso(request.getParameter("curso"));
		u.setPeriodo(request.getParameter("periodo"));
		u.setSenha(request.getParameter("senha"));
		u.setEmail(request.getParameter("email"));

		userDao.inserir(u);
		
		Conta conta = new Conta(u.getId());
		
		userDao.inserirConta(conta);
		
	}

}
