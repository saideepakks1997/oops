package inheritance_hybrid;

public class Dhoni implements WicketKeeping,Batsman {

	@Override
	public void enterTheGround() {
		System.out.println(this.getClass().getSimpleName()+" entering the ground");
	}

	@Override
	public void playWithBat() {
		System.out.println(this.getClass().getSimpleName()+" hits the six into the crowd");
	}

	@Override
	public void catchTheBall() {
		System.out.println(this.getClass().getSimpleName()+" catches the ball by driving from the back");
		
	}

}
