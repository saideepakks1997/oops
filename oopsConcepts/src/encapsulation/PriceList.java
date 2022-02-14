package encapsulation;
import java.util.*;
public class PriceList {
	private List<Goods> goodslist = new ArrayList<>();

	public List<Goods> getGoodslist() {
		if(HomePage.owner.login())
			return goodslist;
		else
			System.out.println("Unauthorized user");
		return null;
	}

	public void setGoodslist(List<Goods> goodslist) {
		this.goodslist = goodslist;
	}

	public void viewProducts() {
		int i=1;
		System.out.printf("%3s %10s %10s", "Sno","Product","Price\n");
		for(Goods g:this.goodslist) {
			System.out.printf("%3d %10s %10d",i++,g.name,g.sellingPrice);
			System.out.println();
		}
	}
}
