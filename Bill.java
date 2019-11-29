import java.util.ArrayList;
import java.util.List;

public class Bill {
	private List<Charge> charges;
	
	public Bill() {
		charges = new ArrayList<Charge>();
	}
	
	public void addCharge(Charge c) {
		charges.add(c);
	}
	
	public void removeCharge(Charge c) {
		charges.remove(c);
	}
	
	public int calculateTotal() {
		int sum = 0;
		for(Charge c : charges) {
			sum += c.getPrice();
		}
		return sum;
	}
	
	public void payBill(PaymentStrategy ps) {
		ps.pay(calculateTotal());
	}
	
	public String toString() {
		String s = "";
		s += "--- Bill ---\n";
		for(Charge c : charges) {
			s += c.toString() + "\n";
		}
		return s;
	}
}
