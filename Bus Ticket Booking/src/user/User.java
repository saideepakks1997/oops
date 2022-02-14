package user;
import validations_and_default_values.ValidationAndVaules;
import java.util.*;
import login.*;
import ticket.*;
public class User {
	static ArrayList<User> users = new ArrayList<>();
	private String name;
	private String user_name;
	private long phno;
	private int gender;//1->male,2->female
	private String password;
	public ArrayList<Ticket> tickets = new ArrayList<>(); 
	public User(String name,int gender) {
		this.name = name;
		this.gender = gender;
		this.password = password;
	}
	
	//ENCAPSULATION (Data validation and Data security)
	//getter and setter methods
	public boolean setPhoneNumber(long phno) {
//		String length = Long
		String phoneNo= phno+"";
		if(phoneNo.length() == ValidationAndVaules.phoneCount 
				&& 
				!Login.phoneNumber_crendentials.containsKey(phno)) {
			this.phno = phno;
			return true;
		}
		System.out.println("Enter phone number of count "
				+ ""+ValidationAndVaules.phoneCount+" or phone number already exists");
		return false;
	}
	public boolean setUserName(String user_name) {
		if(!Login.user_name_credentials.containsKey(user_name)) {
			this.user_name = user_name;
			return true;
		}
			
		System.out.println("User name already exists try different user name");
		return false;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	public String getUserName() {
		return user_name;
	}
	public Long getPhoneNumber() {
		return phno;
	}

	public String getName() {
		return name;
	}
}
