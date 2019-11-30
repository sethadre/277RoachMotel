
public class RegularRoom extends Room {
	
	public static final int COST = 75;
	
	public RegularRoom() {
		description = null;
	}
	
	public RegularRoom(String description) {
		this.description = description;
	}
	
	public int getCost() {
		return COST;
	}
	
	public void accept(RoomVisitor visitor) {
		//Needs to be implemented	
	}
	
	public String toString() {
		return "Regular Room";
	}
}
