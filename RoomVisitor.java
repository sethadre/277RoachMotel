
public interface RoomVisitor {
	//implement different types of rooms
	public void visit(RegularRoom reg);
	public void visit(DeluxeRoom del);
	public void visit(SuiteRoom suite);
}
