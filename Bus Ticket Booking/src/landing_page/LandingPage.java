package landing_page;

import java.util.Scanner;

import admin.AdminHomePage;
import bus.AcSeater;
import bus.AcSleeper;
import bus.Bus;
import bus.NonAcSeater;
import bus.NonAcSleeper;
import validations_and_default_values.ScannerObj;
import user_home_page.*;
public class LandingPage {
	
	public static Bus acSeater = new AcSeater();
	public static Bus acSleeper = new AcSleeper();
	public static Bus nAcSeater = new NonAcSeater();
	public static Bus nAcSleeper = new NonAcSleeper();
	static Scanner sc = ScannerObj.sc;
	
	public static void main(String[] args) {
		askOption();
	}
	//Asks open admin home page or user home page
	private static void askOption() {
		boolean loop = true;
		while(loop) {
			System.out.println("Select Option\n"
					+ "1->Admin\n"
					+ "2->User\n"
					+ "3->Exit");
			int opt = sc.nextInt();
			switch (opt) {
			case 1: AdminHomePage.adminHomePage();
				break;
			case 2: UserHomePage.userHomePage();
				break;
			case 3: System.out.println("Application is closed");
					loop = false;
				break;
			default:System.out.println("Enter correct option");
				break;
			}
		}
				
	}
}
