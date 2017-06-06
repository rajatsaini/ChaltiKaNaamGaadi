package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Ticket {
	
	private static int counter =100;
	
	private String ticketPnr;
	private Date   travelDate;
	private Train  train;
	private List<Passenger> passengersList = new ArrayList<>();
	private double totalTicketAmount;
	
	public Ticket(Date travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}
	
	
	public String generatePNR(){
		return sourceAndDestinationInitials()+"_"+desiredDateString(getTravelDate())+"_"+counter++;
	}
	
	private String sourceAndDestinationInitials(){
		char source = this.getTrain().getTrainSource().charAt(0);
		char destination = this.getTrain().getTrainDestination().charAt(0);
		return Character.toString(source)+Character.toString(destination);
	}
	
	private String desiredDateString(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		return Integer.toString(year)+Integer.toString(month)+Integer.toString(day);
	}
	
	private double calcPassengerFare(Passenger passenger){
		double ticketPrice = getTrain().getTicketPrice();
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
		getPassengers().add(tempPassenger);
	}
	
	public double calculateTotalTicketPrice(){
		double totalFare = 0;
		List<Passenger> passengers = getPassengers();
		for(Passenger p:passengers){
			totalFare += calcPassengerFare(p);
		}
		return totalFare;
	}
	
	public String showTicketDetails(){
		StringBuilder ticketDetail = new StringBuilder();
		ticketDetail.append("PNR:\t"+generatePNR()+"<br>");
		ticketDetail.append("Train No:\t"+getTrain().getTrainNumber()+"<br>");
		ticketDetail.append("Train Name:\t"+getTrain().getTrainName()+"<br>");
		ticketDetail.append("From:\t"+getTrain().getTrainSource()+"<br>");
		ticketDetail.append("To:\t"+getTrain().getTrainDestination()+"<br>");
		ticketDetail.append("Travel Date:\t"+dateInString(getTravelDate())+"<br>");
		ticketDetail.append("<br>Passenger:<br>");
		List<Passenger> passengers = getPassengers();
		for(Passenger p: passengers){
			ticketDetail.append(p.getPassengerName()+"&nbsp");
			ticketDetail.append(p.getPassengerAge()+"&nbsp");
			ticketDetail.append(p.getPassengerGender()+"&nbsp");
			ticketDetail.append(calcPassengerFare(p)+"<br>");
		}
		
		ticketDetail.append("Total Price: \t");
		ticketDetail.append(calculateTotalTicketPrice());
		
		return ticketDetail.toString();
	}
	
	private StringBuilder generateTicket(){
		StringBuilder ticketDetail = new StringBuilder();
		ticketDetail.append("PNR:\t"+generatePNR()+"\n");
		ticketDetail.append("Train No:\t"+getTrain().getTrainNumber()+"\n");
		ticketDetail.append("Train Name:\t"+getTrain().getTrainName()+"\n");
		ticketDetail.append("From:\t"+getTrain().getTrainSource()+"\n");
		ticketDetail.append("To:\t"+getTrain().getTrainDestination()+"\n");
		ticketDetail.append("Travel Date:\t"+dateInString(getTravelDate())+"\n");
		ticketDetail.append("Passenger:\n");
		List<Passenger> passengers = getPassengers();
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
		try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(getTicketPnr()+".txt"))
				){
			bufferedWriter.write(sb.toString());
			bufferedWriter.flush();
			
			File file = new File(getTicketPnr()+".txt");
			if(file.exists()){
				System.out.println("File "+getTicketPnr()+".txt created successfully." );
			}
			else{
				System.out.println("Couldn't Create File.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public File returnTicket(){
		StringBuilder sb = null;
		sb = generateTicket();
		String name = getTicketPnr();
		try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(name+".txt"))
				){
			bufferedWriter.write(sb.toString());
			bufferedWriter.flush();
			
			File file = new File(name+".txt");
			if(file.exists()){
				System.out.println("File "+getTicketPnr()+".txt created successfully." );
				return file;
			}
			else{
				System.out.println("Couldn't Create File.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String getTicketPnr() {
		return ticketPnr;
	}

	public void setTicketPnr(String ticketPnr) {
		this.ticketPnr = ticketPnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public List<Passenger> getPassengers() {
		return passengersList;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengersList = passengers;
	}

	public double getTotalTicketAmount() {
		return totalTicketAmount;
	}

	public void setTotalTicketAmount(double totalTicketAmount) {
		this.totalTicketAmount = totalTicketAmount;
	}
	
	
	
}
