
public class RoachMotel {
	private static RoachMotel instance = null;
	
	private RoachMotel() {}
	
	public static RoachMotel getInstance() {
		if(instance == null) {
			instance = new RoachMotel();
		}
		return instance;
	}
}
