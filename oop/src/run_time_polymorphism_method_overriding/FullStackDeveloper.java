package run_time_polymorphism_method_overriding;

public class FullStackDeveloper extends JobDesignation{
	public FullStackDeveloper() {
		this.salary = 15000;
	}
	@Override
	public void getSalary() {
		System.out.println("Salary of "+this.getClass().getSimpleName()+" is "+this.salary);
	}
}
