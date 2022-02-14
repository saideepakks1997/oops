package abstraction_using_interface;

public class Account {
	private double balance;
	public Account() {
		this.balance = 12000;
	}
	public void setMoney(double amount) {
		if(amount >= 100 && amount <= 10000) {
			System.out.println("Amount deposited succesfully");
			this.balance += amount;
		}
		else
			System.out.println("Enter the amount between 100 to 10000");
	}
	public double displayBalance() {
		return this.balance;
	}
	public void getMoney(double amount) {
		if(amount > this.balance)
			System.out.println("insufficient balance");
		else if(amount >= 100 && amount <= 10000)
			System.out.println("Enter the amount between 100 to 1000");
		else {
			System.out.println("Amount withdrawn succesfully");
			this.balance -= amount;
		}
			
			
	}
	 
}
