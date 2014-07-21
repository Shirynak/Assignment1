import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		for (int i = 0 ; i < 4; i++)
		fillPotholeR();
	
	
	}
	private void fillPotholeR() {
		if (noBeepersPresent()) {
			putBeeper();			
		} else {
			if (frontIsClear()) {
			move();
			} else {
				ascendLeft();
			}
		}
}
	
	
	private void ascendLeft() {
		turnLeft();
		move();
		turnLeft();
	}
	
	
}
