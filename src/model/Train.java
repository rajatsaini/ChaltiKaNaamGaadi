package model;

public class Train {
	
	private int    trainNumber;
	private String trainName;
	private String trainSource;
	private String trainDestination;
	private double ticketPrice;
	
	public Train(){}
	
	public Train(int trainNumber, String trainName, String trainSource, String trainDestination, double ticketPrice) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.trainSource = trainSource;
		this.trainDestination = trainDestination;
		this.ticketPrice = ticketPrice;
	}

	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSource() {
		return trainSource;
	}
	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}
	public String getTrainDestination() {
		return trainDestination;
	}
	public void setTrainDestination(String trainDestination) {
		this.trainDestination = trainDestination;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	@Override
	public String toString() {
		return " Train Details : "
				+ "\n Number=" + trainNumber 
				+ "\n Name=" + trainName 
				+ "\n Source=" + trainSource
				+ "\n Destination=" + trainDestination 
				+ "\n Price=" + ticketPrice + "\n";
	}
	
}
