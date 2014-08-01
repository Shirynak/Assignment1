import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			fixKarel();
		}
	}
	private void fixKarel() {
		fillColumn();
		backToBottom();
		nextColumn();
		
	}
	private void fillColumn() {
		turnLeft();
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
