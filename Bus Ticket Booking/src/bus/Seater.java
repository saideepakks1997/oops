package bus;
import java.util.*;
public class Seater extends Bus{
	{
		totalSeats = NoOfSeatsAndFare.seaterSeats;
		 seatPosition = new ArrayList<>(Collections.nCopies(totalSeats,0+"" ));
		for(int i=0; i<totalSeats;i++)
			seatPosition.set(i,(i+1)+"");
		
	}
	//RunTime polymorphism(Method overriding)
	@Override
	//Display seat position
	public void displaySeatPosition() {
		int seat = 0;
		for(int i=0; i<totalSeats/5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2)
					System.out.print("      ");
				System.out.printf("%3s",seatPosition.get(seat++));
			}
			System.out.println();
		}
	}
}
