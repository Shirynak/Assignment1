import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		for (int i = 0 ; i < 4; i++)
		fillPothole();
		
	}
	private void fillPothole() {
		if (beepersPresent()) {
			moveAlong();
		} else {
			putBeeper();
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
