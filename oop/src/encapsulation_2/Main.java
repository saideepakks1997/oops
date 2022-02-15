package encapsulation_2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		Student student = new Student();
		student.setName("Sai Deepak");
		student.setMarks(99);
		
		boolean loop = true;
		while(loop) {
			System.out.println("------------------------------");
			System.out.println("Entet option \n"
					+ "1->Display student name and marks\n"
					+ "2->updates student marks\n"
					+ "3->exit");
			System.out.println("------------------------------");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:Student.displayNameAndMarks(student);
				break;
			case 2:System.out.println("Enter the marks ");
					int marks = sc.nextInt();
					student.setMarks(marks);
				break;
			case 3:System.out.println("Application is closed");
				loop = false;
				break;
			default:
				break;
			}
		}
	}
}
