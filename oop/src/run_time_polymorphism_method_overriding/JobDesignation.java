package run_time_polymorphism_method_overriding;

public class JobDesignation {
	public int salary;
	public JobDesignation() {
		this.salary = 10000;
	}
	public void getSalary() {
		System.out.println("Salary is "+this.salary);
	}
	public void doWork() {
		System.out.println("Do the work");
	}
}
