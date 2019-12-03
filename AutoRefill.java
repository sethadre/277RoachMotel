/**
 * AutoRefill is an Amenity that can decorate a Room.
 */
public class AutoRefill extends Amenity
{

	protected Room type;
	public static final int COST = 5;

	/**
	 * Creates an AutoRefill that does not decorate any Rooms.
	 */
	public AutoRefill()
	{
		type = null;
	}

	/**
	 * Creates an AutoRefill that decorates a Room.
	 * 
	 * @param type The Room to decorate.
	 */
	public AutoRefill(Room type)
	{
		this.type = type;
	}

	/**
	 * Returns the description of the Room and its Amenities.
	 * 
	 * @return The description of the Room and its Amenities.
	 */
	public String getDescription()
	{
		return type.getDescription() + " with an AutoRefill";
	}

	/**
	 * Returns the cost of the Room and its Amenities.
	 * 
	 * @return The cost of the Room and its Amenities.
	 */
	public int getCost()
	{
		return type.getCost() + COST;
	}

	/**
	 * Accepts a RoomVisitor to this room.
	 * 
	 * @param visitor The RoomVisitor.
	 */
	public void accept(RoomVisitor visitor)
	{
		this.type.accept(visitor);
	}

}
