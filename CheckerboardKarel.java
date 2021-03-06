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
	
	public static void main(String[] args) {
	}
	

public void run() {	
	while (frontIsClear()) {
	fixCheckboard();
	}
	}
	private void fixCheckboard() {
		while (frontIsClear()) {
		moveToEven();
		moveBack();
		moveToOdd();
		
	}
	}
	private void moveToEven() {
		while (frontIsClear()) {
		putBeeper();
		move();
		move();
		}
		
	}
	private void moveToOdd() {
		putBeeper();
		move();
			
	}
	private void moveBack() {
		while (frontIsClear()) {
		turnAround();
		while (frontIsClear()) {
			move();
		}
	}
	}
	
}
