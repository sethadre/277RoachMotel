
public class Tester {

	public static void main(String[] args) {
		Room room1 = new FoodBar(new Spa(new DeluxeRoom()));
		System.out.println(room1.getDescription());
		
	}

}
