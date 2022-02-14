package encapsulation;
import java.util.*;
public class Owner {
	static Scanner sc = new Scanner(System.in);
	String user_name = "sai_deepak";
	String password = "saideepak";
	
	public boolean login() {
		System.out.println("Enter user_name and password");
		String user_name = sc.next();
		String password = sc.next();
		if(user_name.equals(this.user_name) && password.equals(this.password)) {
			return true;
		}
		return false;
			
	}

	public static void showOwnerFunctions() {
		boolean loop = true;
		while(loop) {
			System.out.println("press "
					+ "1->View good with cost price and selling price");
			int opt = sc.nextInt();
			switch (opt) {
			case 1: 
//				boolean isValid = HomePage.owner.login();
				Owner.viewGoodCosttAndSellingPrice();
				break;

			default:
				break;
			}
		}
	}

	private static void viewGoodCosttAndSellingPrice() {
		int i=1;
		List<Goods> goods = HomePage.priceList.getGoodslist();
		if(goods != null) {
			System.out.printf("%2s %10s %10s %10s","Sno","Product","Costprice","Sellingprice\n");
			for(Goods g:goods) {
				System.out.printf("%2d %10s %10d %10d",i++,g.name,g.costPrice,g.sellingPrice);
				System.out.println();
			}
		}
		
	}
}
