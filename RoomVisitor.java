/**
 * @author Tanner Lowthorp
 * @author Evan Chen
 * @author Kali
 * @author Adrian
 * @author William
 */
public interface RoomVisitor {
	//implement different types of rooms
	public void visit(RegularRoom reg);
	public void visit(DeluxeRoom del);
	public void visit(SuiteRoom suite);
}
