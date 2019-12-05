/**
 * Rooms of different types are made in a RoomFactory. Rooms can be visited by
 * RoomVisitors. Rooms can be decorated by an Amenity.
 * @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public abstract class Room
{
	protected RoachColony roomColony;
	protected String description;
	protected boolean doNotDisturb;
	protected int nights;

	public int getNights()
	{
		return nights;
	}

	public void incNights()
	{
		nights++;
	}

	public RoachColony getColony()
	{
		return roomColony;
	}

	/**
	 * Sets the rooms Colony to passed in colony
	 * 
	 * @param roomColony the roomColony to set
	 */
	public void setRoomColony(RoachColony roomColony)
	{
		this.roomColony = roomColony;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDoNotDisturb(boolean dnd)
	{
		doNotDisturb = dnd;
	}

	public boolean getDoNotDisturb()
	{
		return doNotDisturb;
	}

	public abstract int getCost();

	// More methods will be added but this one is necessary for visitor pattern
	public abstract void accept(RoomVisitor visitor);
}
