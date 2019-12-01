/**
 * Spa is an Amenity that can decorate a Room.
 */
public class Spa extends Amenity
{

	protected Room type;
	public static final int COST = 20;

	/**
	 * Creates a Spa that does not decorate any Rooms.
	 */
	public Spa()
	{
		type = null;
	}

	/**
	 * Creates a Spa that decorates a Room.
	 * 
	 * @param type The Room to decorate.
	 */
	public Spa(Room type)
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
		return type.getDescription() + " with a Spa";
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
	 * TODO
	 */
	public void accept(RoomVisitor visitor)
	{

	}

}
