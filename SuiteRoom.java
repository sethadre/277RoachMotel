/**
 * SuiteRoom is a concrete implementation of abstract Room.
 */
public class SuiteRoom extends Room
{

	public static final int COST = 100;

	/**
	 * Creates a SuiteRoom.
	 */
	public SuiteRoom()
	{
		description = "Suite Room";
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
