/**
 * DeluxeRoom is a concrete implementation of abstract Room.
 * @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public class DeluxeRoom extends Room
{

	public static final int COST = 75;

	/**
	 * Creates a DeluxeRoom.
	 */
	public DeluxeRoom()
	{
		description = "Deluxe Room";
	}

	/**
	 * Returns the nightly cost of the room.
	 */
	public int getCost()
	{
		return COST;
	}

	/**
	 * Accepts a RoomVisitor to this room.
	 * 
	 * @param visitor The RoomVisitor.
	 */
	public void accept(RoomVisitor visitor)
	{
		visitor.visit(this);
	}

	/**
	 * Returns a String representation of this room.
	 * 
	 * @return A String representation of this room.
	 */
	public String toString()
	{
		return description;
	}
}
