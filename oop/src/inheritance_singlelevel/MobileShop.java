package inheritance_singlelevel;

import java.util.Scanner;

public class MobileShop {
	static final double gstPercentage = 10; 
	static GalaxyS12 galaxy12 = new GalaxyS12();
	public static void main(String args[]) {
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		while(loop) {
			System.out.println("Select the option for view mobile"
					+ " specification\n"
					+ "1->Price of the mobile\n"
					+ "2->Color of the mobile\n"
					+ "3->How much is the camera pixels\n"
					+ "4->Switch on flash light\n"
					+ "5->open camera\n"
					+ "6->listen to music\n"
					+ "7->Buy the phone");
			int opt = sc.nextInt();
			switch (opt) {
			case 1: System.out.println(galaxy12.modelName+" cost is "+galaxy12.cost);
				break;
			case 2: System.out.println(galaxy12.modelName+" color is "+galaxy12.color);
				break;
			case 3: System.out.println(galaxy12.modelName+" camera pixel is "+galaxy12.cameraPixel);
				break;
			case 4: galaxy12.switchOnFlashLight();
				break;
			case 5: galaxy12.openCamera();
				break;
			case 6: galaxy12.listenMusic();
				break;
			case 7: System.out.println("The payable amount is "+getMobileCostWithGST(galaxy12.cost));
				System.out.println("Thanks for shopping vist again");
				loop = false;
				break;
			default: System.out.println("Enter the correct option");
				break;
			}
		}
	}
	private static double getMobileCostWithGST(double cost) {
		double payabaleAmount = (cost) + (cost * MobileShop.gstPercentage)/100;
		return payabaleAmount;
	}
}
