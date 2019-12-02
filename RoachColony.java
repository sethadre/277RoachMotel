
public class RoachColony {
	private String name;
	private int population;
	private double growthRate;
	
	public RoachColony() {
		name = null;
		population = -1;
		growthRate = 0;
	}
	
	public RoachColony(String name, int population, double growthRate) {
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	public void setPopulation(int newPopSize) {
		population = newPopSize;
	}
	
	public void party() {
		population *= growthRate;
	}
	
	public String toString() {
		return "Colony - Name: " + name + "; Pop.: " + population + "; Rate: " + growthRate;
	}
}
