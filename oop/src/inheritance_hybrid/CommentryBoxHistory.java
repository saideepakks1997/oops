package inheritance_hybrid;

import java.util.Scanner;

public class CommentryBoxHistory {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		CommentryBoxHistory commentry = new CommentryBoxHistory();
		System.out.println("Select player to show his commentry\n"
				+ "1->Sachin\n"
				+ "2->Dhoni\n"
				+ "3->Jadeja");
		int opt = sc.nextInt();
		switch (opt) {
		case 1: commentry.showSachinCommentry();
			break;
		case 2:commentry.showDhoniCommentry();
			break;
		case 3:commentry.showJadejaCommentry();
			break;
		default:
			break;
		}
	}
	private void showDhoniCommentry() {
		BatsmanCumWicketKeeper dhoni = new BatsmanCumWicketKeeper();
		System.out.println("-----------------------------------------");
		dhoni.doAutoGraphForFans();
		dhoni.enterTheGround();
		dhoni.startBatting();
		dhoni.doStumping();
		dhoni.celebrationStyle("Stumping");
		dhoni.catchTheBall();
		dhoni.celebrationStyle("Catch");
		dhoni.discussStrategyWithPlayers();
		System.out.println("-----------------------------------------");
	}
	public void showSachinCommentry() {
		Batsman sachin = new Batsman();
		System.out.println("-----------------------------------------");
		sachin.doAutoGraphForFans();
		sachin.enterTheGround();
		sachin.startBatting();
		sachin.celebrationStyle("hitting century");
		sachin.discussStrategyWithPlayers();
		System.out.println("-----------------------------------------");
	}
	public  void showJadejaCommentry() {
		AllRounder jadeja = new AllRounder();
		System.out.println("-----------------------------------------");
		jadeja.doAutoGraphForFans();
		jadeja.enterTheGround();
		jadeja.startBatting();
		jadeja.celebrationStyle("hitting half century");
		jadeja.setFielding();
		jadeja.startBowling();
		jadeja.celebrationStyle("bowling");
		System.out.println("-----------------------------------------");
	}
}
