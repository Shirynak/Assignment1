import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		putBeepers();
		moveToNextPillow();
		putBeepers();
		moveToNextPillow();	
	}
	private void putBeepers() {
		for (int i = 0; i < 4; i++) 
			moveAlongA();
		
	}
	private void moveAlongA() {
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
	}
	
	private void moveAlongD() {
		if (beepersPresent()) {
			move();
		} else { 
			putBeeper();
			move();
		if (facingSouth()) {
			turnLeft();
		}
		}
		
	}
	
	private void moveToNextPillow() {
		if (frontIsBlocked()) {
			turnRight();
		} else {
			turnLeft();
		}
		move();
		move();
		move();
		move();
		if (frontIsClear()) {
			turnRight();
	
		}
	}
	
		
	
}
