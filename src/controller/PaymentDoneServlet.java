package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/paymentCompleted")
public class PaymentDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		//writer.println("Transaction has Completed. These are your Details :");
		
		/*String ticketShow = (String)session.getAttribute("ticketString");
		writer.println(ticketShow);*/		
		
		RequestDispatcher dispatcherFooter = request.getRequestDispatcher("download.jsp");
		dispatcherFooter.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
