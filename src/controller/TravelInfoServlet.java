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

@WebServlet("/travelInfo")
public class TravelInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		String trainnumber = request.getParameter("trainNumber");
		int trainnum   = Integer.parseInt(trainnumber);
		
		TrainDAO traindao = new TrainDAO();
		Train train = null;
		try {
			train  = traindao.findTrain(trainnum);
		} catch (TrainNotFoundException e) {
			e.getMessage();
		}
		
		//writer.println(train);
		session.setAttribute("trainObject", train);
				
		RequestDispatcher dispatcherFooter = request.getRequestDispatcher("travelinfo.jsp");
		dispatcherFooter.include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
