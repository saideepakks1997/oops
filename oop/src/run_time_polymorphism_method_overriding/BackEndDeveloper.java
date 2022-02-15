package run_time_polymorphism_method_overriding;

public class BackEndDeveloper extends JobDesignation{
	public BackEndDeveloper() {
		this.salary = 12000;
	}
	@Override
	public void getSalary() {
		System.out.println("Salary of "+this.getClass().getSimpleName()+" is "+this.salary);
	}
}
