
import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	public void run() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
}
