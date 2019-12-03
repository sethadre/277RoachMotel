import java.util.ArrayList;

public class RoachMotel
{
	private static RoachMotel instance = null;
	private Room[] rooms;
	private static final int NUMBER_OF_ROOMS = 5;
	private Waitlist wlist;
	private RoomFactory rf;

	/**
	 * Creates a RoachMotel.
	 */
	private RoachMotel()
	{
		rooms = new Room[NUMBER_OF_ROOMS];
		wlist = new Waitlist();
		rf = new RoomFactory();
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
		for (int i = 0; i < NUMBER_OF_ROOMS; i++)
		{
			if (rooms[i] == null)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Set a room in the RoachMotel.
	 * 
	 * @param i  Room number [0-limit)
	 * @param rm The room to set
	 * @return Room that was set
	 */
	public Room setRoom(int i, Room rm)
	{
		if (i >= NUMBER_OF_ROOMS)
			return null;
		return rooms[i] = rm;
	}

	public void checkin(RoachColony rc, String rmtype, String[] amenities)
	{
		if (!hasVacancy())
		{
			System.out.println("No vacancy, colony will be moved to waitlist");
			wlist.addObserver(rc);
		}
		else
		{
			Room rm = rf.getRoom(rmtype);
			for (int i = 0; i < amentities.length; i++)
			{
				switch (amentities[i].toLowerCase())
				{
					case "foodbar":
						rm = FoodBar(rm);
						break;
					case "shower":
						rm = Shower(rm);
						break;
					case "spa":
						rm = Spa(rm);
						break;
					case "autorefill":
						rm = AutoRefill(rm);
						break;
					default:
						break;
				}
			}
			// TODO code to add room to room list
		}
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
