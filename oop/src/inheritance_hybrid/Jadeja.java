package inheritance_hybrid;

public class Jadeja implements Batsman,Bowler{
	String name;
	public Jadeja() {
		this.name = this.getClass().getSimpleName();
	}
	@Override
	public void enterTheGround() {
		System.out.println(name+ " entering the ground ");
		
	}

	@Override
	public void bowlTheBall() {
		System.out.println(name+" bowls a straigh ball and it hits the Stump");
		
	}

	@Override
	public void playWithBat() {
		System.out.println(name+" hits his 25th half century");
		
	}

}
