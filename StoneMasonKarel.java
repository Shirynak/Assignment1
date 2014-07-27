import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		turnLeft();
		while (frontIsClear()) {
			move(); if (noBeepersPresent()) {
				putBeeper();
			} else { 
				move();
				
			}
		
		}
	}
		
	
}
