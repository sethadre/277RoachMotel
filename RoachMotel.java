import java.util.ArrayList;

public class RoachMotel
{
	private static RoachMotel instance = null;
	private Room[] rooms;
	private static final int NUMBER_OF_ROOMS = 5;

	/**
	 * Creates a RoachMotel.
	 */
	private RoachMotel()
	{
		rooms = new Room[NUMBER_OF_ROOMS];
	}

	/**
	 * Gets the RoachMotel.
	 * 
	 * @return The singular RoachMotel.
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
	 * Returns true if the RoachMotel has vacancy.
	 * 
	 * @return True if the RoachMotel has vacancy.
	 */
	public boolean hasVacancy()
	{
		for (int i = 0; i < NUMBER_OF_ROOMS ; i++)
		{
			if ( rooms[i] == null )
			{
				return true
			}
		}
		return false;
	}

	/**
	 * Set a room in the RoachMotel.
	 * 
	 * @param i  Room number [0-limit)
	 * @param rm The room to set
	 */
	public void setRoom(int i, Room rm)
	{
		if (i >= NUMBER_OF_ROOMS)
			return;
		rooms[i] = rm;
	}

	/**
	 * Returns a String representation of this RoachMotel.
	 * 
	 * @return A String representation of this RoachMotel.
	 */
	public String toString()
	{
		if (hasVacancy())
			return "RoachMotel: Open Rooms";
		else
			return "RoachMotel: No Vacancy";
	}
}
