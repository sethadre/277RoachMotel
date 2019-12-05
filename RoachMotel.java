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
	 * create a Room and Check in a colony to the room then add to the list of
	 * rooms.
	 * 
	 * @param rc
	 * @param rmtype
	 * @param amenities
	 * @return the checked-in room
	 */
	public Room checkin(RoachColony rc, String rmtype, String[] amenities)
	{
		if (hasVacancy())
		{
			// create room and assign colony
			Room rm = rf.getRoom(rmtype, amenities);
			rm.setRoomColony(rc);
			rooms.add(rm);
			return rm;
		}
		else
		{
			System.out.println("No vacancy, colony will be moved to waitlist");
			wlist.addObserver(rc);
			return null;
		}
	}

	public void checkout(Room rm)
	{
		rm.getColony().getPaymentStrategy().pay(rm.getCost() * rm.getNights());
		rooms.remove(rm);
		wlist.notifyObservers();
		wlist = new Waitlist();
	}

	public void clean()
	{
		for (Room r : rooms)
		{
			r.accept(m);
		}
	}

	public void incNights()
	{
		for (Room r : rooms)
		{
			r.incNights();
		}
	}

	/**
	 * cullRoom reduces the population by a factor of .5 or .25
	 * 
	 * @param rm - Room to be culled
	 */
	public void cullRoom(Room rm)
	{
		double cullRate = 0.5;
		if (rm.getDescription().contains("Shower"))
		{
			cullRate = 0.25;
		}
		rm.getColony().setPopulation(cullRate);
		System.out.println("Room has been culled by staff");
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
