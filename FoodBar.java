
public class FoodBar extends Amenity{
	
	protected Room type;
	public static final int COST = 10;
	
	public FoodBar() {
		type = null;
	}
	
	public FoodBar(Room type) {
		this.type = type;
	}
	
	public String getDescription() {
		return type.getDescription() + " with a Food Bar";
	}

	public int getCost() {
		return type.getCost() + COST;
	}
	
	public void accept(RoomVisitor visitor) {
		
	}
	
}
