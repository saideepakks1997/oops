package bus;

import java.util.ArrayList;

public class AcSleeper extends Sleeper{
//	int seatAvailable = totalSeats;
	{
		for(int i=0; i<totalSeats;i++)
			seatPosition.set(i,(i+1)+"");
		fare = NoOfSeatsAndFare.acSleeperFare;
		availableSeats = totalSeats;
		tkSeries = 0;
		tkExtension = "acs";
	}
}
