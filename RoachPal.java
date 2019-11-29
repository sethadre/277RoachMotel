
public class RoachPal implements PaymentStrategy {
	private String name;
	private String email;
	
	public RoachPal() {
		name = null;
		email = null;
	}
	
	public RoachPal(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void pay(int amount) {
		//do something
	}
	
	public String toString() {
		return name + ": " + email;
	}
}
