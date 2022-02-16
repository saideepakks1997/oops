package encapsulation_2;

public class Student {
	//Grouping data members and methods
	//Data hiding since data members are private
	private String name;
	private int marks;
	
	//Hiding data behind the methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks >=0 && marks <=100)//Data Validation 
			this.marks = marks;
		else
			System.out.println("Enter the marks between 0 and 100");
	}
	
	public  void displayNameAndMarks(Student student) {
		System.out.println("Name:- "+student.getName());
		System.out.println("Marks scored:- "+student.getMarks());
	}
	public void study() {
		System.out.println("Student studying");
	}
	public void play() {
		System.out.println("Student playing");
	}
}
