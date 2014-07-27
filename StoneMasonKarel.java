import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		for (int i = 0; i < 5; i++)
		turnLeft();
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
		}
	
}
