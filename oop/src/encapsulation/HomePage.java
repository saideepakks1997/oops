package encapsulation;
import java.util.Scanner;
public class HomePage {
	static Owner owner = new Owner();
	static PriceList priceList = new PriceList();
	public static void main(String args[]) {
		
		SetupGoods.setupGoods();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println("Select option");
			System.out.println("1.Owner\n"
					+ "2.Customer");
			int opt = sc.nextInt();
			switch(opt) {
			case 1: Owner.showOwnerFunctions();
				break;
			case 2: OnlineSuperMarket.showProducts();
				break;
			case 3: System.out.println("Application logged out"); 
				loop = false;
				break;
			default :System.out.println("Enter correct option");
				break;
			}
		}
	}
}
