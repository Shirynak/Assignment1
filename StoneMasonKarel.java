import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			fixKarel();
		}
	}
	private void fixKarel() {
		turnLeft();
		fillColumn();
		backToBottom();
		nextColumn();
		
	}
	private void fillColumn() {
		while (frontIsClear()) {
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
		}
	}
	private void backToBottom() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		
	}
	private void nextColumn() {
		turnLeft();
		moveAlong();
		turnLeft();
	}
	private void moveAlong() {
		move();
		move();
		move();
		move();
	}
}
