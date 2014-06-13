package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertFile
 */
@WebServlet("/InsertFile")
public class InsertFileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			boolean insere = new InsertFile().inserir(request, response);
			if (insere == true) {
				request.getSession().setAttribute("upload", "Upload feito!");
			}else{
				request.getSession().setAttribute("upload", "Erro ao fazer upload :/");
			}
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
	}
}


