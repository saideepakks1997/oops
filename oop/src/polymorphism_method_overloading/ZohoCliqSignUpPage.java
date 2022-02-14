package polymorphism_method_overloading;

import java.util.Scanner;

public class ZohoCliqSignUpPage {
	
	static Scanner sc = new Scanner(System.in);
	public void signUp(GMail gmail) {
		displayHomePage();
		}
	public void signUp(long phoneno, int otp) {
		displayHomePage();
	}
	public void signUp(Linkedin linkedin) {
		displayHomePage();
	}
	public static void displayHomePage() {
		System.out.println("Enter the user name ");
		String name = sc.next();
		System.out.println("Welcome to zoho cliq "+name);
		System.out.println("Logged in");
	}
}
