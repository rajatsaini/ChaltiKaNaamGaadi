package service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.Passenger;
import model.Ticket;

public class TicketService {
	
	/*
	
	public Ticket serviceTicket;		
	
	private double calcPassengerFare(Passenger passenger){
		double ticketPrice = serviceTicket.getTrain().getTicketPrice();
		if(passenger.getPassengerAge()<=12){
			return 0.5 * ticketPrice;
		}
		if(passenger.getPassengerAge()>=60){
			return 0.6 * ticketPrice;
		}
		if(passenger.getPassengerGender()=='F'){
			return 0.75 * ticketPrice;
		}
		return ticketPrice;
	}
	
	public void addPassenger(String name,int age,char gender){
		Passenger tempPassenger = new Passenger(name,age,gender);
		serviceTicket.getPassengers().add(tempPassenger);
	}
	
	private double calculateTotalTicketPrice(){
		double totalFare = 0;
		List<Passenger> passengers = serviceTicket.getPassengers();
		for(Passenger p:passengers){
			totalFare += calcPassengerFare(p);
		}
		return totalFare;
	}
	
	private StringBuilder generateTicket(){
		StringBuilder ticketDetail = new StringBuilder();
		ticketDetail.append("PNR:\t"+generatePNR()+"\n");
		ticketDetail.append("Train No:\t"+serviceTicket.getTrain().getTrainNumber()+"\n");
		ticketDetail.append("Train Name:\t"+serviceTicket.getTrain().getTrainName()+"\n");
		ticketDetail.append("From:\t"+serviceTicket.getTrain().getTrainSource()+"\n");
		ticketDetail.append("To:\t"+serviceTicket.getTrain().getTrainDestination()+"\n");
		ticketDetail.append("Travel Date:\t"+dateInString(serviceTicket.getTravelDate())+"\n");
		ticketDetail.append("Passenger:\n");
		List<Passenger> passengers = serviceTicket.getPassengers();
		for(Passenger p: passengers){
			ticketDetail.append(p.getPassengerName()+"\t");
			ticketDetail.append(p.getPassengerAge()+"\t");
			ticketDetail.append(p.getPassengerGender()+"\t");
			ticketDetail.append(calcPassengerFare(p)+"\n");
		}
		
		ticketDetail.append("Total Price: \t");
		ticketDetail.append(calculateTotalTicketPrice());
		
		return ticketDetail;
	}
	
	private String dateInString(Date travelDate){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(travelDate);
		return date;
	}
	
	public void writeTicket(){
		StringBuilder sb = null;
		sb = generateTicket();
		try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(serviceTicket.getTicketPnr()+".txt"))
				){
			bufferedWriter.write(sb.toString());
			bufferedWriter.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	
}
