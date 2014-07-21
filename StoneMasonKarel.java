import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		fillPothole();
		
	}
	private void fillPothole() {
		if (beepersPresent()) {
			if (frontIsClear())
				move();
		} else {
			turnLeft();
			move();
			turnLeft();
			
		}
	}
	private void moveAlong() {
		move();
		move();
		move();
		move();
	}
}
