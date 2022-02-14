package bookTicket;

import bus.Bus;
import java.util.*;
import passenger.Passenger;
import ticket.Ticket;
import user.*;
public interface UpdateUserTicketInfo {
	//Updating user ticket information
	public static void updateUserTicketInfo(
			Bus bus,
			User user,
			int totalFare,
			int totalSeats,
			List<Passenger> passengers) {
		Ticket t = new Ticket(bus.tkSeries+bus.tkExtension,totalSeats,bus,totalFare,passengers);
		user.tickets.add(t);
		//Mapping passenger with respective seat in bus this list is for bus driver/cleaner
		//for checking
		for(Passenger p: t.passengers)
			bus.seatPassengerMap.put(p.seatNo, p);
	}

	
}
