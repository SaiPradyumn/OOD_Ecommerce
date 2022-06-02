import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> products = new ArrayList<>();
	
	public void addProducts(Product product){
		products.add(product);
	}
	
	public int getTotalCost() {
		return products.stream().mapToInt(Product::getPrice).sum(); 
		/*this is a java8 function to return stream of object and return their stream.*/
	}
	
}
