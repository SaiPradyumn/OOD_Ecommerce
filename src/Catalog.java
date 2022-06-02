import java.util.Map;

public class Catalog {

	//this method is used to initialize the map with DB values
	public static Map<String,Product> productMap = Map.of(
			"Electric toothbrush", new Product("Electric toothbrush",3300),
			"Baby Alarm", new Product("Baby Alarm",4500)
			);
	
	//or create a hash map in one line and add the products as key value pair.
	
	public static Product getProduct(String productName) {
		// TODO Auto-generated method stub
		return productMap.get(productName);
	}

}
