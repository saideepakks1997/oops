package user;
import ticket.*;
import passenger.*;
import user.User;
public interface ViewTicketOfUser {
	
	//View all the tickets details of the user
	public static void viewTicketOfUser(User user) {
		for(Ticket t:user.tickets) {
			System.out.println("Ticket no:-"+t.ticketNo);
			System.out.println("No of Seats:-"+t.noOfSeats);
			System.out.println("Total cost:-"+t.cost);
			System.out.println("Bus type:-"+t.type.getClass().getSimpleName());
			System.out.printf("%10s %7s %7s","Name","Gender","Seat No");
			System.out.println();
			for(Passenger p: t.passengers) {
				String gender = (p.gender == 1)?"Male":"Female";
				System.out.printf("%10s %7s %7s",p.name,gender,p.seatNo);
				System.out.println();
			}
			System.out.println("--------------------------------------");
		}
	}
	//View particular ticket details
	public static void viewTicket(User user,String ticketNo) {
		System.out.printf("%7s %10s %7s", "Seat no","Name","Gender\n");
		for(Ticket t:user.tickets) {
			if(t.ticketNo.equals(ticketNo)) {
				for(Passenger p: t.passengers) {
					String gender = (p.gender==1)?"Male":"Female";
					System.out.printf("%7s %10s %7s",p.seatNo,p.name,gender);
					System.out.println();
				}
			}
				
		}
	}
}
