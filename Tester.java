import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Room roomatest = new FoodBar(new Spa(new DeluxeRoom()));
		System.out.println("*****Creating a room with some wrappings of ameneties(not how well actually wrap moving forward:");
		System.out.println(roomatest.getDescription());
		MasterRoach mc1 = new MasterRoach("Roachy Jones","100","1234 5555 1111 2222","10/25");
		MasterRoach mc2 = new MasterRoach("Roachalina Insekt","559","8888 2317 5819 6666","01/23");
		MasterRoach mc3 = new MasterRoach("Roachester Smith","300","**** **** **** 8127","07/25");
		MasterRoach mc4 = new MasterRoach("Roacharino","225","**** **** **** 9152","11/22");
		RoachPal roachpal1 = new RoachPal("Bugsy McCrawsly","CrawlsOnBawls@hotroach.com");
		RoachPal roachpal2 = new RoachPal("Lindsbug Gatorsberg","KrumxXxMuncher52@rocketroach.com");
		RoachPal roachpal3 = new RoachPal("Anthony Bugswall","OnFireFly4@bughoo.com");
		RoachPal roachpal4 = new RoachPal("Leroy Bugkins","UndaDaFridge67@roachmail.com");
		RoachMotel rm = RoachMotel.getInstance();
		System.out.println("*****Created instance of roach motel");
		System.out.println("*****It displays if vacant or not");
		System.out.println(rm);

		System.out.println("*****displaying roachpal payment method 1");
		System.out.println(roachpal1);
		RoachColony rc1 = new  RoachColony("RC1: first colony",100,20,roachpal1);
		System.out.println("*****Created first colony named: first colony");
		System.out.println(rc1);

		Room room1 = rm.checkin(rc1, "deluxe",new String[] {"Spa","Shower","FoodBar","AutoRefill"});
		System.out.println("*****Checking in roach colony 1 into a new deluxe room with full ameneties");
		System.out.println("*****Displaying status of room 1");
		System.out.println(room1.getDescription());
		System.out.println("******Displaying status of roach motel");
		System.out.println(rm);
		System.out.println("******Roach colony throwing a party");
		rc1.party();
		System.out.println("*******Displaying status of roach colony 1");
		System.out.println(rc1);
		RoachColony rc2 = new  RoachColony("RC2: Reckless Party",1500,.2,mc1);
		RoachColony rc3 = new  RoachColony("RC3: Safe Family Trip",2000,1.5,roachpal2);
		RoachColony rc4 = new  RoachColony("RC4: Hungry Party",500,1.2,roachpal3);
		RoachColony rc5 = new  RoachColony("RC5: Fancy Party",750,.3,mc3);
		RoachColony rc6 = new  RoachColony("RC6: Sixth colony",1800,3,mc3);
		RoachColony rc7 = new  RoachColony("RC7: Seventh colony",100,1,roachpal4);
		Room room2 = rm.checkin(rc2, "regular",new String[] {"Spa","FoodBar","AutoRefill"});
		Room room4 = rm.checkin(rc4, "deluxe",new String[] {"FoodBar","AutoRefill"});
		Room room5 = rm.checkin(rc5, "deluxe",new String[] {"Spa","Shower","FoodBar"});
		Room room3 = rm.checkin(rc7,"suite", new String[]{"FoodBar"});
		System.out.println("*******Creating and displaying roach colonies 2-5");
		System.out.println(rc2);
		System.out.println(rc3);
		System.out.println(rc4);
		System.out.println(rc5);
		System.out.println("*******creating rooms for roach colonies 2-5");
		System.out.println(room2.getDescription());
		System.out.println(room3.getDescription());
		System.out.println(room4.getDescription());
		System.out.println(room5.getDescription());
		System.out.println("*******Display status of roach motel after five rooms have been checked in");
		System.out.println(rm);
		room3.setDoNotDisturb(true);
		System.out.println("*******Setting room 3 to Do Not Disturb");
		System.out.println("*******Getting ready to clean the rooms");
		rm.clean();
		System.out.println("*******Trying to check in colony 6");
		Room room6 = rm.checkin(rc6,"suite",new String[] {"Spa","Shower"});
		System.out.println("*******Trying to check in colony 7");
		Room room7 = rm.checkin(rc7,"regular",new String[] {"Spa","Shower","FoodBar"});
		System.out.println("********Displaying status of roach motel");
		System.out.println(rm);

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
