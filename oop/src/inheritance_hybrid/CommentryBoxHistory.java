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
		Dhoni d = new Dhoni();
		System.out.println("----------------------------");
		d.enterTheGround();
		System.out.println("----------------------------");
		d.catchTheBall();
		System.out.println("----------------------------");
		d.playWithBat();
	}
	public void showSachinCommentry() {
		Sachin s = new Sachin();
		System.out.println("----------------------------");
		s.enterTheGround();
		System.out.println("----------------------------");
		s.playWithBat();
	}
	public  void showJadejaCommentry() {
		Jadeja j = new Jadeja();
		System.out.println("----------------------------");
		j.enterTheGround();
		System.out.println("----------------------------");
		j.bowlTheBall();
		System.out.println("----------------------------");
		j.playWithBat();
	}
}
