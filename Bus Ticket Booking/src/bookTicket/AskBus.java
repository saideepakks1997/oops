package bookTicket;

import java.util.Scanner;

import bus.Bus;
import landing_page.LandingPage;
import user_home_page.UserHomePage;
import validations_and_default_values.ScannerObj;

public interface AskBus {
	static Scanner sc = ScannerObj.sc;
	//Asks user for selecting the bus
	public static Bus askBus() {
		System.out.println(""
				+"1.Ac-Sleeper"
				+"2.NonAc-Sleeper"
				+"3.Ac-seater"
				+"4.NonAc-seater"
				);
		int opt = sc.nextInt();
		if(opt == 1)
			return LandingPage.acSleeper;
		else if(opt == 2)
			return LandingPage.nAcSleeper;
		else if(opt == 3)
			return LandingPage.acSeater;
		else if(opt == 4)
			return LandingPage.nAcSeater;
			
		return null;
	}
}
