import java.util.ArrayList;

/**
 * WObservers can register to this waitlist to be notified in the future
 */

public class Waitlist implements WSubject
{
	private ArrayList<WObserver> wList;

	/**
	 * Creates a WaitList
	 */
	public Waitlist()
	{
		wList = new ArrayList<WObserver>();
	}

	/**
	 * Registers WObserver to the Waitlist
	 * 
	 * @param o WObserver to register
	 */
	public void addObserver(WObserver o)
	{
		wList.add(o);
	}

	/**
	 * Removes WObserver from the Waitlist
	 * 
	 * @param o WObserver to remove
	 */
	public void removeObserver(WObserver o)
	{
		wList.remove(o);
	}

	/**
	 * Notifies all registered WObservers
	 */
	public void notifyObservers()
	{
		for (WObserver o : wList)
		{
			o.update("New Vacancy");
		}
	}
}