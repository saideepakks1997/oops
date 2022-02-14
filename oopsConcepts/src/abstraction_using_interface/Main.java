package abstraction_using_interface;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Account acc = new Account();
	static AtmInterface atm = new BackGroundImplementation();
	public static void main(String args[]) {
		
		askOption();
			
	}
	private static void askOption() {
		
		System.out.println("Select option\n"
				+ "1->cash withdrawl\n"
				+ "2->check Balace\n"
				+ "3->deposit cash");
		int opt = sc.nextInt();
		switch (opt) {
		case 1: atm.cashWithdraw();
			break;
		case 2: 
			atm.checkBalance();
			break;
		case 3: atm.cashDeposit();
			
			break;
		default:
			break;
		}
	}
	public static void continueTransaction() {
		System.out.println("Continue transaction \n"
				+ "1->Yes"
				+ "2->No");
		int opt = sc.nextInt();
		if(opt == 1)
			askOption();
		else 
			System.out.println("Thank you");
	}
}
