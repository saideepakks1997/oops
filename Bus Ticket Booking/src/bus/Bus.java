package bus;

import java.util.*;

import passenger.Passenger;
import validations_and_default_values.*;
//Inheritance 
public  abstract class Bus {
	public int fare = 0;//Ticket fare
	public  int tkSeries = 0;//ticket number series
	public String tkExtension = "";//ticket No extenstion eg:-AcSleeper :- acs,NonAcSleeper :- nacs
	
	public int totalSeats = NoOfSeatsAndFare.SEATS;//total seats avalilable in bus
	public int availableSeats = totalSeats;//Available seats in bus
	private int totalEarnings = 0;//Earnings by the bus
	public List<String> seatPosition = null;//Seat position
				//<Seat no,Passenger>
	public Map<String,Passenger> seatPassengerMap = new TreeMap<String, Passenger>();
	public abstract void displaySeatPosition();//Show seat position
	
	public int getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(int totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
}
