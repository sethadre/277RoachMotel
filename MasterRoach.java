
public class MasterRoach implements PaymentStrategy {
	private String name, code, number, date;
	
	public MasterRoach() {
		name = null;
		code = null;
		number = null;
		date = null;
	}
	
	public MasterRoach(String name, String code, String number, String date) {
		this.name = name;
		this.code = code;
		this.number = number;
		this.date = date;
	}
	
	public void pay(int amount) {
		//do something
	}
	
	public String toString() {
		return name + " : " + number + " - " + code + "; " + date;
	}
}
