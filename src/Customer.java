
public class Customer {

	private final String name; // final here since name does not usually change
	private CreditCard creditCard;
	
	public Customer(String name, long cCNumber) {
		this.name = name;
		this.creditCard = new CreditCard(cCNumber);
	}
}
