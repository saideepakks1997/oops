package inheritance_hybrid;

public class Sachin implements Batsman{
	String name;
	public Sachin() {
		this.name = this.getClass().getSimpleName(); 
		System.out.println("This will be last match for "+name);
	}
	@Override
	public void enterTheGround() {
		System.out.println("Crowd cheers when "+name+" enter the ground");
	}

	@Override
	public void playWithBat() {
		System.out.println(name+" hits sixes and fours and scoring century in his last match");
	}

}
