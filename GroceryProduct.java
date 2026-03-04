package guc.supermarket.products;

public class GroceryProduct {

	String name;
	double price;
	double discount;
	
	public GroceryProduct(String name, double price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public final double getActualPrice() {
		double discount_price = price * discount/100;
		return price - discount_price;
	}
	public String toString(){
		return "name: " + name + "\n" +
				"Price: " + price + "\n"  +
				"Discount: "+ discount + "\n" ;
	}
}
