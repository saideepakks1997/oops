package bus;

import passenger.Passenger;
import java.util.*;
public interface RemovePassengerFromSeat {
	//remove passenger from seat
	public static void removePassengerFromSeat(List<Passenger> passengers,Bus bus) {
		for(Passenger p: passengers) {
			String seatNo = p.seatNo;
			bus.seatPassengerMap.remove(seatNo);
			
		}
	}
	//Update seat with its seat number used in display purpose
	public static void updateBusSeat(List<Passenger> passengers,Bus bus) {
		for(Passenger p:passengers) {
			String seatNo = p.seatNo;
			bus.seatPosition.set(Integer.parseInt(seatNo)-1,seatNo);
			}
	}
}
