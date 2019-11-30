
public class DeluxeRoom extends Room {

	public static final int COST = 75;
	
	public DeluxeRoom() {
		description = null;
	}
	
	public DeluxeRoom(String description) {
		this.description = description;
	}
	
	public int getCost() {
		return COST;
	}
	
	public void accept(RoomVisitor visitor) {
		//Needs to be implemented	
	}
	
	public String toString() {
		return "Deluxe Room";
	}
}
