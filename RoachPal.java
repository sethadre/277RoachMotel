/**
 * RoachPal is a payment method, with a name and email
 */
public class RoachPal implements PaymentStrategy
{
	private String name;
	private String email;

	/**
	 * Creates a default (blank) RoachPal payment method
	 */
	public RoachPal()
	{
		name = null;
		email = null;
	}

	/**
	 * Creates a RoachPal payment method with a name and email
	 * 
	 * @param name  Name of payer
	 * @param email Email of payer
	 */
	public RoachPal(String name, String email)
	{
		this.name = name;
		this.email = email;
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
		return "[RoachPal]:" + name + ": " + email;
	}
}
