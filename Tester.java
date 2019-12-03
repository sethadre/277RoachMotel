import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Room room1 = new FoodBar(new Spa(new DeluxeRoom()));
		System.out.println(room1.getDescription());
		MasterRoach mc1 = new MasterRoach("Roachy Jones","100","1234 5555 1111 2222","10/25");
		MasterRoach mc2 = new MasterRoach("Roachalina Insekt","559","8888 2317 5819 2222","01/23");
		RoachPal rp1 = new RoachPal("Bugsy McCrawsly","CrawlsOnBawls@hotroach.com");
		RoachPal rp2 = new RoachPal("Lindsbug Gatorsberg","KrumxXxMuncher52@rocketroach.com");
		RoachMotel rm = RoachMotel.getInstance();
		//rm.createRooms();
		System.out.println(rm);
		//RoachColony rc1 = new  RoachColony("first colony",100,200);
		/*ArrayList theWorks = new ArrayList();
		amenities.add("FoodBar");
		amenities.add("Spa");
		amenities.add("AutoRefill");
		amenities.add("Shower");*/
		//Room r1 = rm.checkIn(rc1,"Suite",amenities);
		room1.setDoNotDisturb(true);
		//System.out.println(rc1);
		System.out.println(rp1);
		//System.out.println(amenities);



		RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
		/*
		ArrayList amenities2 = new ArrayList();
		amenities2.add("foodbar");*/
		Room r2 = rm.checkin(rc2, "deluxe",new String[] {"Spa","Shower","FoodBar","AutoRefill"});
		System.out.println(rc2);
		System.out.println(rm);

		rc2.party();

		System.out.println(rc2);
		/*
		Double cost = rm.checkOut(r2,3,"MasterRoach");
		System.out.println("cost:" + cost);
		System.out.println(rm);
		RoachColony rc3 = new RoachColony("third colony",300,0.3);
		MotelRoom r3 = rm.checkIn(rc3,"Regular",amenities2);
		RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
		MotelRoom r4 = rm.checkIn(rc4,"Regular",amenities2);
		r3.setDoNotDisturb();
		System.out.println("Time to clean the rooms today "+rm);
		rm.cleanRooms();
		RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
		MotelRoom r5 = rm.checkIn(rc5,"Deluxe",amenities2);
		RoachColony rc6 = new RoachColony("sixth colony",600,0.6);
		MotelRoom r6 = rm.checkIn(rc6,"Deluxe",amenities2);
		RoachColony rc7 = new RoachColony("Seventh colony",700,0.7);
		MotelRoom r7 = rm.checkIn(rc7,"Suite",amenities2);
		RoachColony rc8 = new RoachColony("eigth colony",800,0.8);
		MotelRoom r8 = rm.checkIn(rc8,"Suite",amenities2);
		RoachColony rc9 = new RoachColony("ninth colony",900,0.9);
		System.out.println("Time to clean the rooms today"+ rm);
		r1.setDoNotDisturb();
		rm.cleanRooms();
		cost = rm.checkOut(r3,3, "RoachPay");
		System.out.println("cost:" + cost);
		MotelRoom r9 = rm.checkIn(rc9,"Regular",amenities2);
		rm.cleanRooms();

		 */
	}

}
