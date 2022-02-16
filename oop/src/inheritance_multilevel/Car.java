package inheritance_multilevel;

public class Car extends Vehicle{
	int noOfSeats;
	boolean isAcAvailable;
	boolean isPowerSteeringAvailble;
	
	@Override
	public void start() {
		System.out.println("insert the key and start the car");
	}
	
	@Override
	public void applyBreak() {
		System.out.println("Slows down");		
	}
	//sub class specific methods
	public void switchOnAc() {
		System.out.println("Switch on the AC ");
	}
	
}
