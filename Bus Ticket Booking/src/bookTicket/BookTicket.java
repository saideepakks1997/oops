package bookTicket;
import java.util.*;
import validations_and_default_values.ScannerObj;

import bus.*;
import user.*;
import user_home_page.UserHomePage;
import passenger.Passenger;
public class BookTicket {
	static Scanner sc = ScannerObj.sc;
	
	//Booking tickets
	public static void bookTicket(User user) {
		Bus bus= AskBus.askBus();
		bus.displaySeatPosition();
		ArrayList<Passenger> passengers = new ArrayList<>();
		boolean loop = true;
		if(bus.availableSeats == 0) {
			System.out.println("No seats available please try for different bus");
			return;
		}
		System.out.println("Total number of available seats "+bus.availableSeats);
		System.out.println("How many tickets needed");
		int ticketsRequired = sc.nextInt();
		//If tickets entered is greater than available seats
		if(bus.availableSeats < ticketsRequired) {
			System.out.println("Enter seat below "+bus.availableSeats);
			return;
		}
		else if(ticketsRequired == 0)
			return;
		else {
			for(int i=0; i<ticketsRequired; i++) {
			loop = true;
				while(loop) {
					System.out.println("Enter Seat No");
					int seatNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Passenger name");
					String name = sc.nextLine();
					System.out.println("Enter gender 1->Male,2->Female");
					int gender = sc.nextInt();
					String g = (gender == 1) ?"M":"F";
					String isSeatAvailability = bus.seatPosition.get(seatNo-1);
					boolean isOccupied =  isSeatAvailability == "M" || isSeatAvailability =="F" ? true:false;
					if(isOccupied) {
						System.out.println("Seat already occupied");
					}
					else {
						Passenger p = new Passenger(name, gender, seatNo+"");
						passengers.add(p);
						loop = false;
						bus.seatPosition.set(seatNo-1, g);
					}
				}
			}
		}
		
		int totalCost = CalculateFare.calculateFare(ticketsRequired, bus);
		UpdateAvailableSeatsAndEarnings.updateAvailableSeatsAndEarnings(ticketsRequired, bus);
		UpdateUserTicketInfo.updateUserTicketInfo(bus,user,totalCost,ticketsRequired,passengers);
		System.out.println("Total cost of ticket is "+totalCost);
	}	
}
