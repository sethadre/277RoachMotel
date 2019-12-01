/**
 * Amenities decorate rooms.
 */
public abstract class Amenity extends Room
{
	/**
	 * Returns the description of this Amenity as well as the Room it decorates.
	 * @return The description of this Amenity as well as the Room it decorates.
	 */
	public abstract String getDescription();
}