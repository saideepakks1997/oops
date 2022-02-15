package inheritance_multiple;
//Muliple inheritance possible in java by using interface
public class Main {
	public static void main(String args[]) {
		Sai sudhakar = new Sai();
		System.out.println("play method is called which is present"
				+ " in SportsPlayer interface");
		sudhakar.play();
		System.out.println("study method is called which is present"
				+ "in Student interface");
		sudhakar.study();
	}
}
