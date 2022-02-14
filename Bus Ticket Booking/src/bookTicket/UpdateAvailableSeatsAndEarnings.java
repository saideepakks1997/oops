package bookTicket;

import bus.Bus;

public interface UpdateAvailableSeatsAndEarnings {
	//update available seats ,earnings and current ticket series
	public static void updateAvailableSeatsAndEarnings(int tickets, Bus bus) {
		int tripFare = tickets * bus.fare;
		//Updating no of available seats
		bus.availableSeats -= tickets;
		//Updating total money earned by bus
		int oldEarnings = bus.getTotalEarnings();
		bus.setTotalEarnings(oldEarnings + tripFare);
		bus.tkSeries++;
	}
}
