/**
 * RoachColony can register to a waitlist.
 */

public class RoachColony implements WObserver
{
	private String name;
	private int population;
	private double growthRate;

	/**
	 * Creates a "default" RoachColony
	 */
	public RoachColony()
	{
		name = "no_name";
		population = -1;
		growthRate = 0;
	}

	/**
	 * Creates a RoachColony with a name, population, and growth rate
	 * 
	 * @param name       The name of the colony
	 * @param population The population of the colony
	 * @param growthRate The growth rate of the colony
	 */
	public RoachColony(String name, int population, double growthRate)
	{
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}

	/**
	 * Returns the population of the RoachColony
	 * 
	 * @return The population of the RoachColony
	 */
	public int getPopulation()
	{
		return population;
	}

	/**
	 * Returns the growth rate of the RoachColony
	 * 
	 * @return The growth rate of the RoachColony
	 */
	public double getGrowthRate()
	{
		return growthRate;
	}

	/**
	 * Cuts the population of the RoachColony
	 * 
	 * @param fatalRate Portion of population to cut (0,1)
	 */
	public void setPopulation(double fatalRate)
	{
		if (fatalRate > 1 || fatalRate < 0)
			return;
		population *= (1.0 - fatalRate);
	}

	/**
	 * Increases the population of the RoachColony,
	 * based on their growth rate.
	 */
	public void party()
	{
		population *= growthRate;
	}

	/**
	 * Returns a String representation of the RoachColony
	 * @return A String representation of the RoachColony
	 */
	public String toString()
	{
		return "Colony - Name: " + name + "; Pop.: " + population + "; Rate: " + growthRate;
	}

	/**
	 * Updates the colony on anything it is observing
	 * @param newState New state of Object being observered
	 */
	public void update(Object newState)
	{
		System.out.println("[To:" + name + "]:" + newState);
	}
}
