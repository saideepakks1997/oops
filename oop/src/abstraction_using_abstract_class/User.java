package abstraction_using_abstract_class;

import java.util.Scanner;

public class User {
	static Scanner sc = new Scanner(System.in);
	static BusBookingApplication sleeper = new SleeperBusModule();
	static BusBookingApplication seater = new SeaterBusModule();
	public static void main(String args[]) {
		boolean loop = true;
		BusBookingApplication bus = null; 
		while(loop) {
			System.out.println("Select the bus to view or book\n"
					+ "1->Sleeper\n"
					+ "2->Seater\n"
					+ "3->Exit");
			int opt = sc.nextInt();
			if(opt == 1)
				bus = sleeper;
			else if(opt == 2)
				bus = seater;
			else if(opt == 3) {
				System.out.println("Application is closed");
				loop = false;
				return;
			}
			showFunctionsOfBus(bus);
			}
		}
	
	public static void showFunctionsOfBus(BusBookingApplication bus) {
		boolean loop = true;
		while(loop) {
			
			System.out.println("Select Option\n"
					+ "1->View Seat Arrangement\n"
					+ "2->Display fare\n"
					+ "3->Book Ticket\n"
					+ "4->Retrun to previow menu");
			int opt = sc.nextInt();
			switch(opt) {
				case 1:bus.displaySeatArrangment();
					break;
				case 2:bus.displayFareAndSeatAvailability(bus);
					break;
				case 3:bus.bookTicket(bus);
					break;
				case 4:System.out.println("Returning to previos menu");
					loop = false;
					break;
				default: System.out.println("Enter correct option");
					break;
			}
		}
	}
}

