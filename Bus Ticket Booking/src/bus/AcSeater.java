package bus;

import java.util.ArrayList;
import user_home_page.*;
public class AcSeater extends Seater{

	{
		for(int i=0; i<totalSeats;i++)
			seatPosition.set(i,(i+1)+"");
		fare = NoOfSeatsAndFare.acSeaterFare;
		availableSeats = totalSeats;
		tkSeries = 0;
		tkExtension = "acst";
	}
}
