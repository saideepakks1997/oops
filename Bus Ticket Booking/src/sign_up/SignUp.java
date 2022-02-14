package sign_up;
import java.util.*;

import user.AddUser;
import user.User;
import validations_and_default_values.ScannerObj;
import validations_and_default_values.ValidationAndVaules;
public interface SignUp {
	static Scanner sc = ScannerObj.sc;
	//Sign up the user
	public static void signUp() {
		sc.nextLine();
		boolean loop = false;
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter gender 1->Male and 2->Female");
		int gender = sc.nextInt();
		
		
		User u = new User(name,gender);
		
		System.out.println("Enter user name");
		//Gives chance if user_name is already available
		while(!loop) 
			loop = u.setUserName(sc.next());
		
		
		loop = false;
		System.out.println("Enter phone number");
		
		//gives chance if the entered phone number is not equal to default value or
		//is already present
		while(!loop) 
			loop = u.setPhoneNumber(sc.nextLong());
		
		System.out.println("Enter password");
		u.setPassword(sc.next());
		
		AddUser.addUser(u);
		System.out.println("User Registered successfully");
		
		sc.nextLine();
	}
}
