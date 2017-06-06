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

import dao.TrainDAO;
import dao.TrainNotFoundException;
import model.Train;

@WebServlet("/bookTrain")
public class TrainBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession(false);		
		response.setContentType("text/html");
		
		String dateOfTravel = request.getParameter("dateoftravel");
		
		session.setAttribute("dot", dateOfTravel);
		String numberOfPassengers = request.getParameter("passengerNumbers");
		session.setAttribute("numberofpassengers",numberOfPassengers);
		
		/*
		writer.println(dateOfTravel + " "+numberOfPassengers);
		TrainDAO traindao = new TrainDAO();
		Train trainobj = null;
		try {
			trainobj = traindao.findTrain(Integer.parseInt());
		} catch (NumberFormatException | TrainNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Train train = (Train)session.getAttribute("trainObject");
		
		writer.println(train);
		*/
		//train session.getAttribute("trainObject");
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("passengerDetails");
		dispatcher.include(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
