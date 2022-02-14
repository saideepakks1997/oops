package polymorphism_method_overloading;
import java.util.*;
public class User {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		ZohoCliqSignUpPage signup = new ZohoCliqSignUpPage();
		System.out.println("select option\n"
				+ "1->Login using gmail\n"
				+ "2->Login using linkedin\n"
				+ "3->Login using phone number");
		int opt = sc.nextInt();
		switch(opt) {
			case 1: signup.signUp(new GMail());
				break;
			case 2:signup.signUp(new Linkedin());
				break;
			case 3:signup.signUp(9894160632L, 5736);
				break;
			default:System.out.println("Enter the correct option");
				break;
		}
	}
	
	
}
