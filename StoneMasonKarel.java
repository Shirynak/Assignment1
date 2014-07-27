import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		for (int i = 0; i < 5; i++)
			moveAlong();
			moveToNextPillow();
		for (int i = 0; i < 5; i++)
			moveAlong();
			
	}
	private void moveAlong() {
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		if (facingNorth()) {
			turnRight();
		} else {
			turnLeft();
		}
		}
		}
	}
	private void moveToNextPillow() {
		move();
		move();
		move();
		if (leftIsBlocked()) {
			turnRight();
		} else {
			turnLeft();
		}
	}
}
