package admin;

import validations_and_default_values.ScannerObj;
import java.util.Scanner;

import bookTicket.AskBus;
import bus.Bus;
import bus.ViewBusPassengerList;
public class ViewBusStatus {
	static Scanner sc = ScannerObj.sc;

	public static void viewBusStatus() {
		boolean loop = true;
		Bus bus = null;
		String busType = "";
		while(loop) {
			System.out.println("Select option\n"
					+ "1->Display seats avalablity\n"
					+ "2>Display seating Arrangement\n"
					+ "3->Display total money earned\n"
					+ "4->Display Passengers list of bus\n"
					+ "5->Back to previous menu");
			int opt = sc.nextInt();
			switch(opt) {
				case 1: bus = AskBus.askBus();
					 busType = bus.getClass().getSimpleName();
					System.out.println("Total available on bus "+busType+" is "+bus.availableSeats);
					break;
				case 2: bus = AskBus.askBus();
					bus.displaySeatPosition();
					break;
				case 3: bus = AskBus.askBus();
				 busType = bus.getClass().getSimpleName();
				System.out.println("Total money on bus "+busType+" is "+bus.getTotalEarnings());
					break;
				case 4: ViewBusPassengerList.displayPassengerList();
					break;
				case 5: System.out.println("Back to previuos menu"); 
					loop = false;
					break;
				default:System.out.println("Enter valid option");
					break;
			}
		}
	}
	
	
	//Display bus seat position
	
	//Display Total Number of seats Available
	private static void displaySeatsAvailability() {
			Bus bus = AskBus.askBus();
			String busType = bus.getClass().getSimpleName();
			System.out.println("Total available on bus "+busType+" is "+bus.availableSeats);
	}
}
