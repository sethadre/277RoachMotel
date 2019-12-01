
public class RoomFactory {
	public RoomFactory() {}
	
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
