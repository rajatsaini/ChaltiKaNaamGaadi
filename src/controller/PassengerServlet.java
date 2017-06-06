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

/**
 * Servlet implementation class PassengerServlet
 */
@WebServlet("/passengerDetails")
public class PassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session = request.getSession(false);
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("booking.jsp");
		dispatcher.include(request, response);*/
		
		String number = (String) session.getAttribute("numberofpassengers");
		int passengernumber = Integer.parseInt(number);
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><link rel='stylesheet' href='css/stylesheet.css'></head><div class='container'>");

		out.println("<tr>");
		
		RequestDispatcher dispatcherHeader = request.getRequestDispatcher("header.jsp");
		dispatcherHeader.include(request, response);
		
		out.println("<form action='checkDetails' method='post'><table>");
		for(int i=1;i<=passengernumber;i++){
			out.println("<tr>");
			out.print("<td><h3>Passenger " + i+"</h3></td>");
			out.print("<td>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("passengerForm.jsp");
			dispatcher.include(request, response);
			out.print("</td>");
			out.print("</tr>");

		}
		out.println("</table><input class = 'button' type='submit' value='submit'/></form>");

		RequestDispatcher dispatcherFooter = request.getRequestDispatcher("footer.jsp");
		dispatcherFooter.include(request, response);
		
		out.println("</div>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
