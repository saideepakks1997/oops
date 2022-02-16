package inheritance_hierarchical;
import java.util.Scanner;
public class BikeOwner {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		BikeOwner bikeOwner = new BikeOwner();
		Bike bike = null;
		System.out.println("Which bike u would like to ride\n"
				+ "1->Gear Bike\n"
				+ "2->Non Gear Bike");
		int bikeType = sc.nextInt();
		switch(bikeType) {
			case 1: bikeOwner.goWithGearBike();
				break;
			case 2: bikeOwner.goWithNonGearBike();
				break;
			default: System.out.println("Enter the correct option");
				break;
		}
		
	}
	private void goWithNonGearBike() {
		NonGearBike nonGearBike = new NonGearBike();
		System.out.println("--------------------------------------");
		nonGearBike.start();
		nonGearBike.adjustTheMirror();
		nonGearBike.applyBreak();
		nonGearBike.keepTheHelmetInDicky();
		System.out.println("Trip ended");
		System.out.println("--------------------------------------");
	}
	private void goWithGearBike() {
		GearBike gearBike = new GearBike();
		System.out.println("--------------------------------------");
		gearBike.start();
		gearBike.adjustTheMirror();
		gearBike.increseGear();
		gearBike.putInReserve();
		gearBike.applyBreak();
		System.out.println("Trip ended");
		System.out.println("--------------------------------------");
	}
}
