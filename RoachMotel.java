import java.util.ArrayList;

public class RoachMotel
{
	private static RoachMotel instance = null;
	private ArrayList<Room> rooms;

	/**
	 * Creates a RoachMotel
	 */
	private RoachMotel()
	{
		rooms = new ArrayList<Room>();
	}

	/**
	 * Gets the RoachMotel
	 * @return The singular RoachMotel
	 */
	public static RoachMotel getInstance()
	{
		if (instance == null)
		{
			instance = new RoachMotel();
		}
		return instance;
	}

	/**
	 * Adds a room to the RoachMotel
	 * 
	 * @param r The Room to add
	 * @return success
	 */
	public boolean addRoom(Room r)
	{
		return rooms.add(r);
	}

	/**
	 * Removes a room from the RoachMotel
	 * 
	 * @param r The Room to remove
	 * @return success
	 */
	public boolean removeRoom(Room r)
	{
		return rooms.remove(r);
	}
}
