package inheritance_singlelevel;
//In samsung we can have keypad phone as well as touch phone
public class SamsungMobile {
	int cost;
	String color;
	String modelName;
		public void call() {
			System.out.println("Dial the number and call");
		}
		public void messege() {
			System.out.println("Type the messege and select the contact "
					+ "and send messege");
		}
		public void switchOnFlashLight() {
			System.out.println("Flash light switch on");
		}
}
