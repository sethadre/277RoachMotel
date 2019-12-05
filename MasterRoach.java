/**
 * MasterRoach is a payment strategy. Requires a name, code, security number,
 * expiry date
* @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public class MasterRoach implements PaymentStrategy
{
	private String name, code, number, date;

	/**
	 * Create a default (blank) MasterRoach payment method
	 */
	public MasterRoach()
	{
		name = null;
		code = null;
		number = null;
		date = null;
	}

	/**
	 * Create a MasterRoach payment method with a name, code, security number,
	 * expiry date
	 * 
	 * @param name   Cardholder name
	 * @param code   Credit Card Number
	 * @param number Security Code
	 * @param date   Expiry Date
	 */
	public MasterRoach(String name, String code, String number, String date)
	{
		this.name = name;
		this.code = code;
		this.number = number;
		this.date = date;
	}

	/**
	 * Pay for an amount with this MasterRoach card
	 * 
	 * @param amount The amount to be paid for
	 */
	public void pay(int amount)
	{
		System.out.println("Paid " + amount + " using " + toString());
	}

	/**
	 * Returns a String representation of this MasterRoach
	 * 
	 * @return A String representation of this MasterRoach
	 */
	public String toString()
	{
		return "[MasterRoach]:" + name + " - " + number + " (" + code + ") " + date;
	}
}
