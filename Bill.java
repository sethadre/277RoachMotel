import java.util.ArrayList;
import java.util.List;

/**
 * Bill depends on a payment strategy and has charges. Charges can be added to a
 * bill. A final payment method can be passed through a method to pay.
* @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public class Bill
{
	private List<Charge> charges;

	/**
	 * Creates a new Bill
	 */
	public Bill()
	{
		charges = new ArrayList<Charge>();
	}

	/**
	 * Adds a charge to the Bill
	 * 
	 * @param c The Charge to add
	 */
	public void addCharge(Charge c)
	{
		charges.add(c);
	}

	/**
	 * Removes a charge from the Bill, if it exists
	 * 
	 * @param c The Charge to remove
	 */
	public void removeCharge(Charge c)
	{
		charges.remove(c);
	}

	/**
	 * Returns the total cost of this Bill
	 * 
	 * @return Total cost of this Bill
	 */
	public int calculateTotal()
	{
		int sum = 0;
		for (Charge c : charges)
		{
			sum += c.getPrice();
		}
		return sum;
	}

	/**
	 * Pays for the bill using a PaymentStrategy
	 * 
	 * @param ps The PaymentStrategy to use
	 */
	public void payBill(PaymentStrategy ps)
	{
		ps.pay(calculateTotal());
	}

	/**
	 * Returns a String representation of this Bill
	 * 
	 * @return This Bill as a String representation
	 */
	public String toString()
	{
		String s = "";
		s += "--- Bill ---\n";
		for (Charge c : charges)
		{
			s += c.toString() + "\n";
		}
		return s;
	}
}
