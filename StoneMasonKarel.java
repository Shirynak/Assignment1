import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fillPothole();
		
	}
	private void fillPothole() {
		if (noBeepersPresent()) {
			putBeeper();
			move();
			move();
			move();
			move();
		} else {
			move();
			move();
			move();
			move();
		}
	}
	
}
