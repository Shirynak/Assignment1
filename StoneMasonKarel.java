import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		moveIfClear();
		if (noBeepersPresent()) {
			putBeeper(); 
			 
				
		}
	}
	private void moveIfClear() {
		while (frontIsClear())
			move(); 
	}
	
}
