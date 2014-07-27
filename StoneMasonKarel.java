import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		for (int i = 0; i < 5; i++)
			moveAlongA();
			moveToNextPillow();
		for (int i = 0; i < 5; i++)
			moveAlongD();
			
	}
	private void moveAlongA() {
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		if (facingNorth()) {
			turnRight();
		}
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
