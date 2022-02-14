package ticket;
import bus.*;
import java.util.*;
import passenger.Passenger;
public class Ticket {
	public String ticketNo;
	public int noOfSeats;
	static TreeMap<Bus,Passenger> ticketList = new TreeMap<>();//String is seat no
	public Bus type;
	public int cost;
	public List<Passenger> passengers = new ArrayList<>();  
	public Ticket(String ticketNo,int noOfSeats,Bus bus,int cost,List<Passenger> passengers) {
		this.noOfSeats = noOfSeats;
		this.type = bus;
		this.cost = cost;
		this.ticketNo = ticketNo;
		this.passengers = passengers;
	}
}
