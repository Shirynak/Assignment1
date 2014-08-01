/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

public void run() {
	turnLeft();	
	fixCheckboard();
	}
	private void fixCheckboard() {
		placeBeeper1();
		moveBack();
	}
	private void placeBeeper1() {
		while (frontIsClear()) {
			putBeeper();
			move();
			move();
		}
		
	}
	private void moveBack() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
	}
}
