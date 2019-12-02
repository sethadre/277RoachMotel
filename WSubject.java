public interface WSubject
{
	/* allows an observer to register with the subject */
	public void addObserver(WObserver o);

	/* removes an observer */
	public void removeObserver(WObserver o);

	/* notifes all registered observers when its state changes */
	public void notifyObservers();
}