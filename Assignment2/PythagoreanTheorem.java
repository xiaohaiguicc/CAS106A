/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		println("Enter values to compute Pythagorean theorem.");
		computeSqrt();
	}
	private void computeSqrt(){
		int a = readInt ("a:"); //asks user to enter an integer for a
		int b = readInt ("b:"); //asks user to enter an integer for b
		double c = Math.sqrt(((double)a * a) + (b * b));
		println("c = " + c);
		
		}
}
