package bus;
import java.util.*;
public class NonAcSleeper extends Sleeper{
	//initial seat position
	{
		for(int i=0; i<totalSeats;i++)
			seatPosition.set(i,(i+1)+"");
		fare = NoOfSeatsAndFare.NonAcSleeperFare;
		availableSeats = totalSeats;
		tkSeries = 0;
		tkExtension = "nacs";
	}
}
