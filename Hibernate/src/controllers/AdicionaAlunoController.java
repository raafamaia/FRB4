package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastraAluno
 */
@WebServlet(name = "cadastrar", urlPatterns = { "/CadastraAluno", "/EditaAluno", "/ListaAluno" })
public class AdicionaAlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getRequestURI().contains("CadastraAluno")){
			RequestDispatcher rd = request.getRequestDispatcher("adiciona-aluno.html");
			rd.forward(request, response);
		}else if(request.getRequestURI().contains("ListaAluno")){
			request.getRequestDispatcher("lista-usuarios").forward(request, response);
		}
	}
	
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		if(request.getRequestURI().contains("CadastraAluno")){
			try {
				new AdicionaAluno().create(request, response);
			} catch (Exception e) {
				throw new ServletException("A camada model gerou uma exceção", e);
			}
		RequestDispatcher rd = request.getRequestDispatcher("aluno-cadastrado.jsp");
		rd.forward(request, response);
		}
		else if(request.getRequestURI().contains("EditaAluno")){
//			Nada Ainda :(
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("error.html");
			rd.forward(request, response);
		}
	}
	

}
