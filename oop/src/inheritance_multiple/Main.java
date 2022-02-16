package inheritance_multiple;

import java.util.Scanner;

//Muliple inheritance possible in java by using interface
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Son son = new Son();
		System.out.println("press enter to look the activities of the guy");
		String pressEnter = sc.nextLine();
		System.out.println("----------------------------------");
		son.play();
		son.study();
		son.cookTheFood();
		son.talkWithStranger();
		son.rideBike();
		System.out.println("----------------------------------");
	}
	
}
