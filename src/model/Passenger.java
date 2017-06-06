package model;

public class Passenger {
	
	private String passengerName;
	private int    passengerAge;
	private char   passengerGender;
	
	public Passenger(){}
	
	public Passenger(String name,int age,char gender ){
		this.passengerName = name;
		this.passengerAge  = age;
		this.passengerGender = Character.toUpperCase(gender);
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public char getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(char passengerGender) {
		this.passengerGender = passengerGender;
	}
	
	
	
	
}
