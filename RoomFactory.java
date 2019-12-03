/**
 * Creates rooms of specified types
 */
public class RoomFactory {
	/**
	 * Creates a RoomFactory
	 */
	public RoomFactory() {}
	
	/**
	 * Returns a room of specified type
	 * 
	 * @param type The type of room (regular, deluxe, suite)
	 */
	public Room getRoom(String type) {
		if(type == "regular") {
			return new RegularRoom();
		}
		else if(type == "deluxe") {
			return new DeluxeRoom();
		}
		else if(type == "suite") {
			return new SuiteRoom();
		}
		return null;
	}
}
