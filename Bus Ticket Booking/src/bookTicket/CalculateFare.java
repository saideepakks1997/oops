package bookTicket;
import bus.*;
import bus.Bus;
public interface CalculateFare {
	//Calculate the total fare
	public static int calculateFare(int tickets, Bus bus) {
		int tripFare = tickets * bus.fare;
		return tripFare;
	}
}
