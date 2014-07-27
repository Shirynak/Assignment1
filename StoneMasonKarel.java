import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		moveIfClear();
		}
	}
	private void moveIfClear() {
		while (frontIsClear())
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
	
	}
}
