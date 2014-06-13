package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(name = "home", urlPatterns = { "/home", "/" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			if(request.getSession(false).getAttribute("username") == null || request.getSession(false).getAttribute("username").equals("")){
				request.setAttribute("erro", "Acesso somente logado!");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else{
				request.setAttribute("username", request.getSession().getAttribute("username"));
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
		}catch(Exception e){
			request.setAttribute("erro", "Acesso somente logado!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
