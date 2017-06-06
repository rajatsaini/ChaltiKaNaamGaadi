package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import util.DBUtil;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name = "register", urlPatterns = { "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		String email = request.getParameter("umail");

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		if((UserDAO.register(username, password, email))>0){
			
			request.setAttribute("successRegistration", "Succssfully registered, you may log in now.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}else{
			out.println("Something went wrong!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}
		
	}


}
