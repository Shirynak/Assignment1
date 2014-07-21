import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fillPothole();
		
	}
	private void fillPothole() {
		if (noBeepersPresent()) {
			putBeeper();
		} else {
			move();
			move();
			move();
			move();
		}
	}
	
}
