import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
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
		while (frontIsClear()) {
		if (beepersPresent()) {
			move();
		} else { 
			putBeeper();
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
