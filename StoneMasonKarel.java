import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		for (int i = 0 ; i < 13; i++)
			while (frontIsClear()) 
				move();
			if (noBeepersPresent()) {
				putBeeper();
			} else {
				move();
			}
	}
	
	
}
