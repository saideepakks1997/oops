package bus;
import java.util.*;

import bookTicket.AskBus;
import passenger.Passenger;
import user_home_page.*;
import validations_and_default_values.*;
public interface ViewBusPassengerList {
	static Scanner sc = ScannerObj.sc;
	
	//View Passengers for particular bus for admin purpose
	public static void displayPassengerList() {
		Bus bus=AskBus.askBus();
		System.out.printf("%7s %10s %7s","Seat No","Name","Gender\n");
		for(
				Map.Entry<String, Passenger> entry: 
					 	bus.seatPassengerMap.entrySet()
		) {
			String gender = (entry.getValue().gender == 1)? "Male" : "Female";
			System.out.printf("%7s %10s %7s",entry.getKey(),entry.getValue().name,gender);
			System.out.println();
		}
			
	}
}
