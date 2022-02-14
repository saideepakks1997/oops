package encapsulation;
import java.util.*;
public class SetupGoods {
	public static void setupGoods() {
		List<Goods> goods = new ArrayList<Goods>();
		Goods g1 = new Goods("Soap",20,25);
		Goods g2 = new Goods("Pen",4,5);
		Goods g3 = new Goods("Maggie",10,12);
		Goods g4 = new Goods("Biscuits",9,10);
		goods.add(g1);
		goods.add(g2);
		goods.add(g3);
		goods.add(g4);
		HomePage.priceList.setGoodslist(goods);
	}
}
