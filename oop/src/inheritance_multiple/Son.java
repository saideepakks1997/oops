package inheritance_multiple;

public class Son implements Father,Mother{

	public void play() {
		System.out.println("playing hard and win the game");
	}

	
	public void study() {
		System.out.println("Studying the annual exam portions");
		}


	@Override
	public void cookTheFood() {
		System.out.println("cut the vegetables and start cooking");
	}


	@Override
	public void rideBike() {
		System.out.println("start riding the bike");
	}


	@Override
	public void talkWithStranger() {
		System.out.println("talking to  people by maintaining eye contact");
		
	}

	
}
