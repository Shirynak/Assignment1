import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		if (noBeepersPresent()) {
			putBeeper();
			move();
		} else { 
			move();
		}
		}
	
}
