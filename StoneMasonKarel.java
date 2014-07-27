import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnleft();
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
		}
	
}
