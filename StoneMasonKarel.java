import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fillPothole();
		
	}
	private void fillPothole() {
		if (noBeepersPresent()) {
			putBeeper();
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
