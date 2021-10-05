package gse.airfrance;

/**
 * Passenger Class for AirFrance Project
 * 
 * @author Dennis Adler
 */

import java.util.ArrayList;

public class Passenger {
	
	//Passengers
	private String name;
	//Passenger List
	private ArrayList<Flight> passengerList;
	
	
	//Passenger Builder
	public Passenger(String name) 
	{
		this.name = name;
		ArrayList<Flight> passengerList = new ArrayList<Flight>();
		if (passengerList.contains(name)) 
		{
			System.out.println("Name is already registered."); 
		}
		else if (Seat.reserved <= 0) 
		{
			
			System.out.println("No free seats available.")
		}
			
		else if (!passengerList.contains(name) && Seat.reserved > 0)
		{
		passengerList.add(name);
		Seat.reserveSeat();
		System.out.println("You have been added to the passengers list. Your seat number is " + Seat.location ".")
		}
		System.out.println(toString());
	}
	
	
	//get Passenger Name
	public String getName() {
		return name;
		System.out.println(toString());
	}
	
	//If a passenger takes the flight or not.
	public void takesFlight(String name) {
		if (Seat.reserved = false)
		{
			passengerList.remove(name);
			System.out.println("Passenger has been removed from the list.");
		}
		if (Seat.reserved = true) 
		{
			System.out.println("Your flight number is " + flightNum + ". Enjoy!");
		}
		System.out.println(toString());
	}
	
	//toString Method
	public String toString() {
		return "Passenger";
		return name;
	}
}
