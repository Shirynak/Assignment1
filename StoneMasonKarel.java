import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			fixKarel();
		}
	}
	private void fixKarel() {
		fillColumn();
		
		
	}
	private void fillColumn() {
		turnLeft();
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
	}
}
