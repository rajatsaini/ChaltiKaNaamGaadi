package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Ticket;
import model.Train;

/**
 * Servlet implementation class CheckDetails
 */
@WebServlet("/checkDetails")
public class CheckDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		String details = "These are your Details.";
		
		request.setAttribute("ticketdetails", details);
		
		//writer.println("These are your Details.");
		
		String passengerName[] = request.getParameterValues("name");
		String passengerAge[] = request.getParameterValues("age");
		String passengerGender[] = request.getParameterValues("gender");
		

		String date = (String)session.getAttribute("dot");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date travelDate = null;
		try {
			travelDate = sdf.parse(date);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
		Train bookedTrain = (Train)session.getAttribute("trainObject");
		
		Ticket ticket = new Ticket(travelDate,bookedTrain);
		
		String passengers = (String)session.getAttribute("numberofpassengers");
		int numbers = Integer.parseInt(passengers);
		
		for(int i=0;i<numbers;i++){
			if(passengerName[i]!=null && !passengerName[i].equals("")){
				String name = passengerName[i];
				int age     = Integer.parseInt(passengerAge[i]);
				char gender = passengerGender[i].charAt(0);
				ticket.addPassenger(name, age, gender);
			}
		}
		
		ticket.setTicketPnr(ticket.generatePNR());
		ticket.setTotalTicketAmount(ticket.calculateTotalTicketPrice());
		//ticket.writeTicket();
		session.setAttribute("ticket", ticket);
		
		session.setAttribute("ticketFile",ticket.returnTicket());
		
		String ticketString = ticket.showTicketDetails();
		session.setAttribute("ticketString", ticketString);
		RequestDispatcher dispatcherFooter = request.getRequestDispatcher("checkdetails.jsp");
		dispatcherFooter.include(request, response);
		
		String newFile = new File("Demo.txt").getAbsolutePath();
		writer.println(newFile);
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
