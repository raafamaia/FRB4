package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Documento;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dataaccess.UsuarioDAO;

public class InsertFile extends HttpServlet {

	
	protected boolean inserir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();


		boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
		if (!isMultipartContent) {
			return false;
		}
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> fields = upload.parseRequest(request);
			Iterator<FileItem> it = fields.iterator();
			if (!it.hasNext()) {
				return false;
			}
			while (it.hasNext()) {
				FileItem fileItem = it.next();
				boolean isFormField = fileItem.isFormField();
				if (!isFormField) {
					Documento doc = new Documento();
					doc.setNome(fileItem.getName());
					doc.setSize(String.valueOf(fileItem.getSize()));
					UsuarioDAO p = new UsuarioDAO();
					doc.setConta(p.findContaByUserId((long) request.getAttribute("usuario_id")));
					try{
						p.inserirDocumento(doc);
						return true;
					}catch(Exception e){
						return false;
					}
					
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		return false;
	}
}


