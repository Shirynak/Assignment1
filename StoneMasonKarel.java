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
		turnLeft();
	}
}
