package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(name = "login", urlPatterns = { "/login", "/logout"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().setAttribute("username", "");
		request.getSession().invalidate();
		try{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException("Ocorreu algum erro.", e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			boolean autenticado = new Login().autentica(request, response);
			
			if (autenticado == true) {
				request.getSession().setAttribute("username", request.getParameter("txtUsuario"));
				
				response.sendRedirect("home");
			}else{
				request.setAttribute("erro","Usuário ou Senha incorretos!");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			throw new ServletException("Ocorreu algum erro.", e);
		}
	}

}
