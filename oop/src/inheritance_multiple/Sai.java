package inheritance_multiple;

public class Sai implements Student,SportsPlayer{

//	@Override
	public void play() {
		System.out.println("Play hard and win the game");
	}

	@Override
	public void study() {
		System.out.println("Study the book");
		}

}
