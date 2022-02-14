package admin;
import java.util.Scanner;

import validations_and_default_values.ScannerObj;

public class AdminHomePage {
	static Scanner sc = ScannerObj.sc; 
	
	public static void adminHomePage() {
		boolean loop = true;
		while(loop) {
			System.out.println("Select Option\n"
					+ "1->View Bus status\n"
					+ "2->Return to main page");
			int opt = sc.nextInt();
			switch (opt) {
			case 1: ViewBusStatus.viewBusStatus();
				break;
			case 2: System.out.println("Returning to home page");
					loop = false;
			default:System.out.println("Enter correct option");
				break;
			}
		}
		
	}
}
