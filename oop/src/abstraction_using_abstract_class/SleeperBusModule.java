package abstraction_using_abstract_class;

public class SleeperBusModule extends BusBookingApplication{
	SleeperBusModule(){
		super.totalSeats = 40;
		super.fare = 1000;
		super.availableSeats = totalSeats;
	}

	@Override
	public void displaySeatArrangment() {
		int seat = 1;
		for(int i=0; i<totalSeats/2; i++) {
			if(i%2 == 0)
				System.out.println("lower birth   ");
			else 
				System.out.println("upper birth   ");
			for(int j=0; j<2; j++) {
				System.out.printf("%3d",seat++);
				if(j == 0)
					System.out.print("      ");
			}
			System.out.println();
		}
		
	}

//	@Override
//	public void displayFareAndSeatAvailability() {
//		// TODO Auto-generated method stub
//		
//	}
}
