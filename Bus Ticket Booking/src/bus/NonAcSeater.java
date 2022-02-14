package bus;

import java.util.ArrayList;

public class NonAcSeater extends Seater{
//	int seatAvailable = totalSeats; 

	{
		
		for(int i=0; i<totalSeats;i++)
			seatPosition.set(i,(i+1)+"");
		fare = NoOfSeatsAndFare.NonAcSeaterFare;
		availableSeats = totalSeats;
		tkSeries = 0;
		tkExtension = "nacst";
	}
}
