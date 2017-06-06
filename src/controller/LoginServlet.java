package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		HttpSession session = null;
		try {
			if(UserDAO.login(username,password)){
				session = request.getSession();
				session.setAttribute("validUser", "true");
				writer.println("Logged in.");
				if(session == null){
					System.out.println("Session doesn't exist !!");
				}
				else{
					System.out.println("Session Exists. Select Searcing");
				}
				RequestDispatcher dispatcher = request.getRequestDispatcher("trainSearch.jsp");
				dispatcher.forward(request, response);
			}else{
				//writer.println("<font color='red'><b>Invalid Credentials</b></font>");
				//request.setCharacterEncoding(arg0);
				//response.set
				request.setAttribute("invalid", "Invalid Credentials");
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
				
				dispatcher.include(request, response);
				
				//writer.print("<div class='toast'>Invalid Credentials!!</div>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
