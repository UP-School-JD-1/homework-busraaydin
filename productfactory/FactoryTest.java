package productfactory;

import java.util.Date;

public class FactoryTest {

	public static void main(String[] args) {
		FoodProduct food=new FoodProduct("Strawberry","1", 40, 5, new Date(2022,9,12), 3);
		ClothProduct cloth=new ClothProduct("Trousers","1", "Woman", "L", 200, 30);
		Gift gift=new Gift("Coat", "1233");
		Consultancy consultancy=new Consultancy("Repair", "567", 1000, 100);
		OldComputerSales sale=new OldComputerSales(3000, 500);
		
		food.showPrice();
		food.getPlace();
		
		cloth.showPrice();
		cloth.getDepot();
		
		gift.getPlace();
		gift.prepare();
		
		consultancy.getDescription();
		consultancy.showPrice();
		
		sale.showPrice();
		sale.purchase();

	}

}
 