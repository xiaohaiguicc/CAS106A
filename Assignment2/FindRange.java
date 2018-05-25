/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	/** Sentinel number */
	private static final int SENTINEL = 0;
	public void run() {
		/* You fill this in */
		println("This program finds the larges and smallest numbers.");
			numberRange();
	}
	
	private void numberRange() {
		int i = 1;// number of input integer
		int a = readInt("? ");//asks user to enter an integer for a
		int Max_number = a; //set max initial number
		int Mini_number = a; //set mini intial number
		while(a != SENTINEL){
			int temp = readInt("? ");//asks user to enter next integer 
			i++;//read one more integer
			if(temp == SENTINEL) {
				break;
			}else if(temp < Mini_number) {
				 Mini_number = temp; //set new mini number
			}else if(temp > Max_number) {
				Max_number = temp; //set new max number
			}
			a = temp;//give the next value to a
		}
		if (i == 1 ) {
			println("this is not a valid first value ");
		}
		else {
			println("smallest :" + Mini_number);
			println("largest :" + Max_number);
			
		}
		 
	}
}

