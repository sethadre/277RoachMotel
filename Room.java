/**
 * Rooms of different types are made in a RoomFactory. Rooms can be visited by
 * RoomVisitors. Rooms can be decorated by an Amenity.
 */
public abstract class Room
{
	protected String description;

	public String getDescription()
	{
		return description;
	}

	public abstract int getCost();

	// More methods will be added but this one is necessary for visitor pattern
	public abstract void accept(RoomVisitor visitor);
}
