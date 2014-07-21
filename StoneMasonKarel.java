import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		moveToWall();
		
	}
	private void moveToWall() {
		if (beepersPresent()) {
			moveAlong();
		} else {
			moveAlong();
		}
	}
	private void moveAlong() {
		move();
		move();
		move();
		move();
	}
}
