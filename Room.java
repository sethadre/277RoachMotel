
public abstract class Room {
	//More methods will be added but this one is necessary for visitor pattern
	public void accept(RoomVisitor visitor);
}
