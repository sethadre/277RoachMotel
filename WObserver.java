/**
 * @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public interface WObserver
{
	/**
	 * This method is called when the state of the subject changes.
	 * 
	 * @param newState - the new state of the subject
	 */
	public void update(Object newState);
}