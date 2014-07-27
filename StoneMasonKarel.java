import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		for (int i = 0; i < 5; i++)
			moveAlong();
	}
	private void moveAlong() {
		turnLeft();
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
	}
	
}
