package abstraction_using_interface;

import java.util.Scanner;

public class BackGroundImplementation implements AtmInterface{
	static Scanner sc = new Scanner(System.in);
	@Override
	public void cashWithdraw() {
		System.out.println("Enter the amount to with draw");
		double amount = sc.nextDouble();
		Main.acc.getMoney(amount);
		Main.continueTransaction();
	}
	

	@Override
	public void checkBalance() {
		System.out.println("The available amount is "+Main.acc.displayBalance());
		Main.continueTransaction();
	}

	@Override
	public void cashDeposit() {
		System.out.println("Enter the amount to deposit");
		double amount = sc.nextLong();
		Main.acc.setMoney(amount);
		Main.continueTransaction();
		}

}
