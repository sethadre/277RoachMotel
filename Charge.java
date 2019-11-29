
public class Charge {
	private String description;
	private int price;
	
	public Charge() {
		description = "N/A";
		price = 0; 
	}
	public Charge(String description, int price) {
		this.description = description;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return description + " - $" + price;
	}
}
