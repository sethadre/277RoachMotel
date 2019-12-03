/**
 * Rooms of different types are made in a RoomFactory. Rooms can be visited by
 * RoomVisitors. Rooms can be decorated by an Amenity.
 */
public abstract class Room
{
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
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDoNotDisturb( boolean dnd )
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
