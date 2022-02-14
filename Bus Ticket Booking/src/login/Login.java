package login;
import java.util.HashMap;
import java.util.Scanner;
import loginHomePage.HomePage;
import user.User;
import validations_and_default_values.ScannerObj;
public class Login {
	public static HashMap<String,User> user_name_credentials = new HashMap<>();
	public static HashMap<Long,User> phoneNumber_crendentials = new HashMap<>();

	static Scanner sc = ScannerObj.sc;
	
	//Compile Time polymorphism(Method Overloading )
	public static boolean login(long phoneNo, String password) {
		if(
				phoneNumber_crendentials.containsKey(phoneNo) 
				&&
				phoneNumber_crendentials.get(phoneNo).getPassword().equals(password)
			)
			return true;
		return false;
	}
	public static boolean login(String userName, String password) {
		if(
				user_name_credentials.containsKey(userName) 
				&&
				user_name_credentials.get(userName).getPassword().equals(password)
			)
			return true;
		return false;
	}
	//Asks user whether login with user_name or phone_number
	public static void askLoginOptions() {
		User user = null;
		System.out.println("1.Login using phone number\n"
				+ "2.Login using user name");
		int opt = sc.nextInt();
		boolean isValid = false;
		//Login using phone number
		if(opt == 1) {
			System.out.println("Enter phone number,Enter password");
			long phno = sc.nextLong();
			String password = sc.next();
			isValid = Login.login(phno, password);
				user = phoneNumber_crendentials.get(phno);
				
		}
		//Login using user name		
		else if(opt == 2) {
			System.out.println("Enter user name,Enter password");
			String user_name = sc.next();
			String password = sc.next();
			isValid = Login.login(user_name, password);
				user = user_name_credentials.get(user_name);
			}
		if(isValid) {
			HomePage.homePage(user);
		}
		else
			System.out.println("Enter correct credentials");
	}
	

}
