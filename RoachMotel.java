import java.util.ArrayList;

public class RoachMotel
{
	private static RoachMotel instance = null;
	private Room[] rooms;
	private static final int NUMBER_OF_ROOMS = 5;
	private boolean vacancy;

	/**
	 * Creates a RoachMotel.
	 */
	private RoachMotel()
	{
		rooms = new Room[NUMBER_OF_ROOMS];
		vacancy = true;
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
		return vacancy;
	}

	/**
	 * Returns a String representation of this RoachMotel.
	 * 
	 * @return A String representation of this RoachMotel.
	 */
	public String toString()
	{
		if (vacancy)
			return "RoachMotel: Open Rooms";
		else
			return "RoachMotel: No Vacancy";
	}
}
