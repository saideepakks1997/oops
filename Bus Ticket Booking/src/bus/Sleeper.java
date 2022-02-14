package bus;

import java.util.ArrayList;
import java.util.Collections;

public class Sleeper extends Bus{
	{
		totalSeats = NoOfSeatsAndFare.sleeperSeats;
		 seatPosition = new ArrayList<>(Collections.nCopies(totalSeats,0+"" ));

		for(int i=0; i<totalSeats;i++)
			seatPosition.set(i,(i+1)+"");
//		
	}
	//RunTime polymorphism(Method overriding)
	@Override
	public void displaySeatPosition() {
		int seat = 0;
		for(int i=0; i<totalSeats/2; i++) {
			if(i%2 == 0)
				System.out.println("     lower birth   ");
			else 
				System.out.println("     upper birth   ");
			for(int j=0; j<2; j++) {
				
				if(j == 0)
					System.out.print("      ");
				System.out.printf("%3s",seatPosition.get(seat++));
			}
			System.out.println();
		}
	}
}
