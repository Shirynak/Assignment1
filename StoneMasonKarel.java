import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
		}
	
}
