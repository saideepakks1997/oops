package inheritance_multilevel;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BMW bmw = new BMW();
		System.out.println("Press enter to start the car");
		String val = sc.nextLine();
		
		bmw.start();
		bmw.switchOnAc();
		bmw.switchToBoostAccelerateMode();
		bmw.applyBreak();
		bmw.autoParking();
		
	}
}
