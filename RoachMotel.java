import java.util.ArrayList;

public class RoachMotel
{
	private static RoachMotel instance = null;
	private Room[] rooms;
	private boolean vacancy;

	/**
	 * Creates a RoachMotel.
	 */
	private RoachMotel()
	{
		rooms = new Room[5];
		vacancy = true;
	}
	
	private RoachMotel(int numOfRooms) {
		rooms = new Room[numOfRooms];
		vacancy = true;
	}

	/**
	 * Gets the RoachMotel.
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
	
	public static RoachMotel getInstance(int numOfRooms) {
		if (instance == null)
		{
			instance = new RoachMotel(numOfRooms);
		}
		return instance;
	}
	
	public boolean hasVacancy() {
		return vacancy;
	}
	
	/**
	 * Returns a String representation of this RoachMotel.
	 * @return A String representation of this RoachMotel.
	 */
	public String toString()
	{
		// TODO
		if(vacancy) 
			return "RoachMotel: Open Rooms";
		else
			return "RoachMotel: No Vacancy";
	}
}
