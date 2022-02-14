package user;
import login.*;
public interface AddUser {
	public static void addUser(User u) {
		User.users.add(u);
		Login.user_name_credentials.put(u.getUserName(),u);
		Login.phoneNumber_crendentials.put(u.getPhoneNumber(), u);
	}
}
