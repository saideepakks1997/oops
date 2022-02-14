package abstraction_using_abstract_class;

public class SeaterBusModule extends BusBookingApplication{
	public SeaterBusModule() {
		super.totalSeats = 50;
		super.fare = 500;
		super.availableSeats = totalSeats;
	}
	@Override
	public void displaySeatArrangment() {
		int seat = 1;
		for(int i=0; i<totalSeats/5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2)
					System.out.print("      ");
				System.out.printf("%3d",seat++);
			}
			System.out.println();
		}
	}

//	@Override
//	public void displayFareAndSeatAvailability() {
//		
//	}
	
}
