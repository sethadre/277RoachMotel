/**
 * Maid is a RoomVisitor. Maid will clean rooms if the doNotDisturb sign is off.
 */
public class Maid implements RoomVisitor
{
	/**
	 * Visits a regular room
	 * 
	 * @param reg The regular room to visit
	 */
	public void visit(RegularRoom reg)
	{
		System.out.println("Visiting " + reg.getDescription());
		if (reg.getDoNotDisturb())
		{
			System.out.println("Do Not Disturb.");
		}
		else
		{
			System.out.println("Linens Changed.");
			System.out.println("Towels on floor replaced.");
		}
		System.out.println("Done.");
	}

	/**
	 * Visits a deluxe room
	 * 
	 * @param reg The deluxe room to visit
	 */
	public void visit(DeluxeRoom del)
	{
		System.out.println("Visiting " + del.getDescription());
		if (del.getDoNotDisturb())
		{
			System.out.println("Do Not Disturb.");
		}
		else
		{
			System.out.println("Linens Changed.");
			System.out.println("All towels replaced.");
		}
		System.out.println("Done.");
	}

	/**
	 * Visits a suite room
	 * 
	 * @param reg The suite room to visit
	 */
	public void visit(SuiteRoom suite)
	{
		System.out.println("Visiting " + suite.getDescription());
		if (suite.getDoNotDisturb())
		{
			System.out.println("Do Not Disturb.");
		}
		else
		{
			System.out.println("Linens Changed.");
			System.out.println("All towels replaced.");
			System.out.println("Pillow hamburgers given.");
		}
		System.out.println("Done.");
	}

}
