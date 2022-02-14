package loginHomePage;
import user.User;
import user.ViewTicketOfUser;
import validations_and_default_values.ScannerObj;
import java.util.Scanner;

import bookTicket.AskBus;
import bookTicket.BookTicket;
import bus.*;
import cancelTicket.CancelTicket;
public class HomePage {
	static Scanner sc = ScannerObj.sc;
	public static void homePage(User user) {
		System.out.println("Welcome "+user.getName());
		boolean loop = true;
		while(loop) {
			System.out.println(""
					+ "1.Book Tickets\n"
					+ "2.Cancel Tickets\n"
					+ "3.View Tickets\n"
					+ "5.View Bus Seats\n"
					+ "6.log out"
					);
			int opt = sc.nextInt();
			switch(opt) {
				case 1: BookTicket.bookTicket(user);
					break;
				case 2: CancelTicket.cancelTicket(user);
					break;
				case 3: ViewTicketOfUser.viewTicketOfUser(user);
					break;
				case 5: Bus bus = AskBus.askBus();
						bus.displaySeatPosition();
					break;
				case 6: loop = false;
					break;
			}
			
		}
	}
}
