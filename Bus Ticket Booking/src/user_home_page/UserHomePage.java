package user_home_page;
import java.util.*;
import sign_up.SignUp;
import user.AddUser;
import user.User;
import validations_and_default_values.ScannerObj;
import login.Login;
import bus.*;
public class UserHomePage {
	
	
	static Scanner sc = ScannerObj.sc;
	
	public static void userHomePage() {
		//Register dummy user 
		User u = new User("sai", 1);
		u.setUserName("sai");
		u.setPhoneNumber(1);
		u.setPassword("1");
		AddUser.addUser(u);
		boolean loop = true;
		while(loop) {
			System.out.println("1.Sign up");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			int opt = sc.nextInt();
			switch(opt) {
				case 1: SignUp.signUp();
					break;
				case 2: Login.askLoginOptions();
					break;
				case 3:
					System.out.println("Thank you visit again");
					loop = false;
					break;
			}
		}
	}

}
