
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
		turnLeft();
		turnLeft();
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
	
}
