package run_time_polymorphism_method_overriding;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			JobDesignation jd = null;
			System.out.println("------------------------------");
			System.out.println("Select to  look the salary of job role\n"
					+ "1->UI developer\n"
					+ "2->Backend developer\n"
					+ "3->Full stack developer\n"
					+ "4->Exit");
			System.out.println("------------------------------");
			int opt = sc.nextInt();
			switch(opt) {
				case 1: jd = new UiDeveloper();
					jd.getSalary();
					break;
				case 2: jd = new BackEndDeveloper();
					jd.getSalary();
					break;
				case 3: jd = new FullStackDeveloper();
					jd.getSalary();
					break;
				case 4: loop = false;
					System.out.println("Exiting");
					break;
				default: System.out.println("Enter correct option");
			}
		}
	}
}
