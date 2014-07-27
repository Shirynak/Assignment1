import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		if (noBeepersPresent()) {
			putBeeper();
		} else { 
			move();
		}
		}
	
}
