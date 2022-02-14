package inheritance;
import java.util.Scanner;
public class BikeOwner {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		boolean loop = true;
		Bike bike = null;
		System.out.println("Which bike u would like to ride\n"
				+ "1->Gear Bike\n"
				+ "2->Non Gear Bike");
		int biketype = sc.nextInt();
		bike = (biketype == 1)?new GearBike():new NonGearBike();
		while(loop) {
			System.out.println("-------------------------------");
			System.out.println("Select option");
			System.out.println("1.start and ride the bike\n"
					+ "2.Apply Break");
			if(bike instanceof GearBike)
				System.out.println("3.Increase the gear");
			System.out.println("4.Stop the bike");
			System.out.println("-------------------------------");
			int opt = sc.nextInt();
			switch (opt) {
			case 1: bike.start();
				break;
			case 2: bike.applyBreak();
				break;
			case 3:GearBike b = (GearBike)bike;
				b.increseGear();
				break;
			case 4:System.out.println("Destination reached");
				loop = false;
				break;
				
			default:System.out.println("Enter correct option");
				break;
			}
		}
		
	}
}
