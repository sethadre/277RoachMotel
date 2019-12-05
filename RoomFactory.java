/**
 * Creates rooms of specified types
 * @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public class RoomFactory {
	/**
	 * Creates a RoomFactory
	 */
	public RoomFactory() {}
	
	/**
	 * Returns a room of specified type
	 * 
	 * @param type The type of room (regular, deluxe, suite)
	 */
	public Room getRoom(String type) {
		if(type == "regular") {
			return new RegularRoom();
		}
		else if(type == "deluxe") {
			return new DeluxeRoom();
		}
		else if(type == "suite") {
			return new SuiteRoom();
		}
		return null;
	}
	
	/**
	 * Creates a a room of type type and decorates it with amenities.
	 * @param type the type of room you wish to make (regular, deluxe, suite)
	 * @param amenities a string array of amenities to add to the room
	 * @return the Room that was made
	 */
	public Room getRoom(String type, String[] amenities) {
		Room r = null;
		//Create room type
		if(type == "regular") {
			r = new RegularRoom();
		}
		else if(type == "deluxe") {
			r = new DeluxeRoom();
		}
		else if(type == "suite") {
			r = new SuiteRoom();
		}
		else {
			return null;
		}
		
		//add amenities
		for(String amenity : amenities) {
			switch(amenity.toLowerCase()) {
				case "spa"			: r = new Spa(r);		break;
				case "foodbar"		: r = new FoodBar(r);	break;
				case "shower"		: r = new Shower(r);	break;
				case "autorefill"	: r = new AutoRefill(r);break;
				default : break;
			}
		}
		return r;
	}

	/**
	 * Creates a a room of type type and decorates it with amenities.
	 * @param type the type of room you wish to make (regular, deluxe, suite)
	 * @param amenities a string array of amenities to add to the room
	 * @return the Room that was made
	 */
	public Room getRoom(RoachColony colony, String type, String[] amenities) {
		Room r = null;
		//Create room type
		if(type == "regular") {
			r = new RegularRoom();
		}
		else if(type == "deluxe") {
			r = new DeluxeRoom();
		}
		else if(type == "suite") {
			r = new SuiteRoom();
		}
		else {
			return null;
		}
		
		//add amenities
		for(String amenity : amenities) {
			switch(amenity.toLowerCase()) {
				case "spa"			: r = new Spa(r);		break;
				case "foodbar"		: r = new FoodBar(r);	break;
				case "shower"		: r = new Shower(r);	break;
				case "autorefill"	: r = new AutoRefill(r);break;
				default : break;
			}
		}
		r.setRoomColony(colony);
		return r;
	}
}
