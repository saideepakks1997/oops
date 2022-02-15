package inheritance_singlelevel;

import java.util.Scanner;

public class MobileShop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		SamsungMobile sm = new GalaxyS12();
		System.out.println("Press enter to look samsung galaxy"
				+ "s12 features");
		String enter = sc.nextLine();
		sm.call();
		sm.messege();
		GalaxyS12 galaxy = (GalaxyS12)sm;//downcasting
		galaxy.openCamera();
	
	}
}
