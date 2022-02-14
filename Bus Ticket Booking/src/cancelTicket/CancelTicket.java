package cancelTicket;
import java.util.*;
import bus.*;
import bus.RemovePassengerFromSeat;
import passenger.Passenger;
import ticket.Ticket;
import user.*;
import validations_and_default_values.ScannerObj;
public class CancelTicket {
	static Scanner sc = ScannerObj.sc;
		public static void cancelTicket(User user) {
			//If the user does not have any tickets booked
			if(user.tickets.size() == 0) {
				System.out.println("No tickets in the booking history");
				return;
			}
			
			System.out.println("Enter Ticket number");
			ViewTicketOfUser.viewTicketOfUser(user);
			
			System.out.println("Select\n"
					+"1->Cancel all seats\n"
					+ "2->Cancel particular seat");
			int opt = sc.nextInt();
			if(opt == 1) {
				CancelTicket.cancelAllSeats(user);
			}
			else if(opt == 2)
				CancelTicket.cancelParticularSeat(user);
			
			
		}
		//Cacel particular seat from an ticket
		private static void cancelParticularSeat(User user) {
			System.out.println("Enter ticket Number");
			String tNo = sc.next();
			List<Passenger> passengerList = null;
			List<Passenger> cancelledPassengers = new ArrayList<>();
			Bus bus= null;
			int intialSize = 0;
			for(int i=0; i<user.tickets.size(); i++) {
				String ticketNo = user.tickets.get(i).ticketNo;
				if(ticketNo.equals(tNo)) {
					bus = user.tickets.get(i).type;

					passengerList = user.tickets.get(i).passengers;
					intialSize = passengerList.size();
					for(int j=0; j<intialSize; j++) {
						Passenger p = passengerList.get(j);
						System.out.println("Seat no :-"+p.seatNo+"  Name:-"+p.name);
						System.out.println("Do you want to delete this seat \n"
								+ "1->Yes\n"
								+ "2->No");
						int opt = sc.nextInt();
						if(opt == 1) {
							cancelledPassengers.add(p);
							passengerList.remove(j);
						}
					}
					break;
				}
			}
			updateSeatEarningsPassengers(cancelledPassengers,bus);

		}
		//Cancel all the seats related to that particular ticket
		private static void cancelAllSeats(User user) {
			System.out.println("Enter Ticket Number");
			String tNo = sc.next();
			List<Passenger> passengerList = null;
			Bus bus = null;
			List<Integer> seats = null;
			
			for(int i=0; i<user.tickets.size(); i++) {
				String ticketNo = user.tickets.get(i).ticketNo;
				if(ticketNo.equals(tNo)) {
					bus = user.tickets.get(i).type;
					passengerList = user.tickets.get(i).passengers;
					user.tickets.remove(i);
					break;
				}
			}
			updateSeatEarningsPassengers(passengerList,bus);

		}
		//Display all bus and get input bus from user
		public static Bus getBus(User user,String tNo) {
			Bus bus = null;
			for(int i=0; i<user.tickets.size(); i++) {
				
				String ticketNo = user.tickets.get(i).ticketNo;
				if(ticketNo.equals(tNo)) {
					bus = user.tickets.get(i).type;
					break;
				}
			}
			return bus;
		}
		public static void updateSeatEarningsPassengers(List<Passenger> passengersList,Bus bus) {
			int retainedTickets = passengersList.size();
			int refundAmount  = bus.fare * retainedTickets;
			//Updating total earning by bus
			int oldEarnings = bus.getTotalEarnings();
			bus.setTotalEarnings(oldEarnings - refundAmount); 
			
			bus.availableSeats += retainedTickets;
			//Delete the list from driver side
			RemovePassengerFromSeat.removePassengerFromSeat(passengersList,bus);
			//updating seating arrangement
			RemovePassengerFromSeat.updateBusSeat(passengersList,bus);
			System.out.println("Ticket cancelled successfully");
			System.out.println(refundAmount+" will be refunded within 24 hours");
		}
}
