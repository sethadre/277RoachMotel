import java.util.ArrayList;

public class RoachMotel
{
	private static RoachMotel instance = null;
	private ArrayList<Room> rooms;
	private static final int MAX_NUMBER_OF_ROOMS = 5;
	private Waitlist wlist;
	private RoomFactory rf;
	private Maid m;

	/**
	 * Creates a RoachMotel.
	 */
	private RoachMotel()
	{
		rooms = new ArrayList<Room>(MAX_NUMBER_OF_ROOMS);
		wlist = new Waitlist();
		rf = new RoomFactory();
		m = new Maid();
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
		return (rooms.size() < MAX_NUMBER_OF_ROOMS) ? true : false;
	}
	
	/**
	 * create a Room and Check in a colony to the room
	 * then add to the list of rooms.
	 * @param rc
	 * @param rmtype
	 * @param amenities
	 */
	public void checkin(RoachColony rc, String rmtype, String[] amenities)
	{
		if(hasVacancy()) {
			//create room and assign colony
			Room rm = rf.getRoom(rmtype, amenities);
			//TODO assign colony to room
			rooms.add(rm);
		}
		else {
			System.out.println("No vacancy, colony will be moved to waitlist");
			wlist.addObserver(rc);
		}
	}
	
	public void clean()
	{
		for ( Room r : rooms )
		{
			r.accept(m);
		}
	}
	
	public void incNight()
	{
		for ( Room r : rooms )
		{
			r.incNight();
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
