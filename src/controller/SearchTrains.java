package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TrainDAO;
import dao.TrainNotFoundException;
import model.Train;


@WebServlet("/search")
public class SearchTrains extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String searchType = request.getParameter("type");
		String searchVariableString = request.getParameter("searchString");
		TrainDAO trainDao = new TrainDAO();
		ArrayList<Train> trainArray = new ArrayList<>();
				
		//find train by train number
				if(searchType.equals("trainNumber")){
				
				try {
					int searchvariableInteger = Integer.parseInt(searchVariableString);
					Train trainFound = trainDao.findTrain(searchvariableInteger);
					
						trainArray.add(trainFound);
						request.setAttribute("trainObj", trainArray);
				
						RequestDispatcher dispatcher = request.getRequestDispatcher("displayTrains.jsp");
						dispatcher.include(request, response);
						
				} catch(NumberFormatException e) {
					
					request.setAttribute("trainerror", "Please enter a Valid Train Number.");

					RequestDispatcher dispatcher = request.getRequestDispatcher("trainSearch.jsp");
					dispatcher.include(request, response);
				//	writer.println("<font color ='red'><br/><h2>Please enter a Valid Train Number</h2></font>");
				}
				catch (TrainNotFoundException e) {
					
					request.setAttribute("trainerror", "Train with this Train Number does not exist!");
					
					RequestDispatcher dispatcher = request.getRequestDispatcher("trainSearch.jsp");
					dispatcher.include(request, response);
					//writer.println("<font color ='red'><br/><h2>Train with this Train Number does not exist!!</h2></font>");
					
				}
		}
				
				if(searchType.equals("trainSource")){
					try {
						List<Train> trainFound = trainDao.findTrainsWithSource(searchVariableString);
		
						trainArray.addAll(trainFound);
						request.setAttribute("trainObj", trainArray);
						
						RequestDispatcher dispatcher = request.getRequestDispatcher("displayTrains.jsp");
						dispatcher.include(request, response);
					
					} catch (TrainNotFoundException e) {
						
						request.setAttribute("trainerror", "Train with this Source does not exist!!");
						
						RequestDispatcher dispatcher = request.getRequestDispatcher("trainSearch.jsp");
						dispatcher.include(request, response);
						//writer.println("<font color ='red'><br/><h2>Train with this Source does not exist!!</h2></font>");
					}
			}
				
				if(searchType.equals("trainDestination")){
					try {
						List<Train> trainFound = trainDao.findTrainWithDestination(searchVariableString);
		
						trainArray.addAll(trainFound);
						request.setAttribute("trainObj", trainArray);
						
						RequestDispatcher dispatcher = request.getRequestDispatcher("displayTrains.jsp");
						dispatcher.include(request, response);
					
					} catch (TrainNotFoundException e) {
						
						request.setAttribute("trainerror", "Train with this Destination does not exist!");
						
						RequestDispatcher dispatcher = request.getRequestDispatcher("trainSearch.jsp");
						dispatcher.include(request, response);
						//writer.println("<font color ='red'><br/><h2>Train with this Destination does not exist!!</h2></font>");
					}
			}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
