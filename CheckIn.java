/*
* @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public class CheckIn {
	private RoomFactory factory;
	
	public CheckIn() {
		factory = new RoomFactory();
	}
	
	public CheckIn(RoomFactory factory) {
		this.factory = factory;
	}
	
	public Room orderRoom(String type) {
		return factory.getRoom(type);
	}
}
