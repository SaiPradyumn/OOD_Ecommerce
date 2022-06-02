
public class DriverCode {
	public static void main(String args[]) {
		ShoppingCart shoppingCart = new ShoppingCart();
		
		/*
		 * Problem: product objects are being created in the client(driver) code rather than by the 
		 * system usually catalog is stored in the data base and then the objects are retrieved in the code
		 * here, we create the catalog class[2] to simulate the database behavior rather than directly 
		 * initializing the product obj[1]
		*/
		
		
		/* 
		 * case where obj is initialized here directly [1]
		 * Product toothbrush = new Product("Electric toothbrush",3300);
		 * Product babyAlarm = new Product("Baby Alarm", 4500);
		*/
		
		/*case [2]--> using catalog class*/
		Product toothbrush = Catalog.getProduct("Electric toothbrush");
		Product babyAlarm = Catalog.getProduct("Baby Alarm");		
		
		shoppingCart.addProducts(toothbrush);
		shoppingCart.addProducts(babyAlarm);
		
		System.out.println(shoppingCart);
		System.out.println(shoppingCart.getTotalCost());
		
	}

}
