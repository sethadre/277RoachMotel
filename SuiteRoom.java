
public class SuiteRoom extends Room {

	public static final int COST = 100;
	
	public SuiteRoom() {
		description = null;
	}
	
	public SuiteRoom(String description) {
		this.description = description;
	}
	
	public int getCost() {
		return COST;
	}
	
	public void accept(RoomVisitor visitor) {
		//Needs to be implemented	
	}
	
	public String toString() {
		return "Suite Room";
	}
}
