/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	/** final number */
	private static final int FINAL_NUMBER = 1;
	public void run() {
		/* You fill this in */
		int a  = readInt("Enter a number: ");//asks user to enter an integer for a
		processNumber(a);
	}
	
	private void processNumber(int a) {
		int temp = a;//set beginning number
		int i = 0;//process times
		while( temp != FINAL_NUMBER) {
			int reminder  = temp % 2;//reminder of a
			if(reminder == 0) {
				temp = evenNumber(temp);
			}
			else {
				temp = oddNumber(temp);
			}
			i++;
		}
		println("The preoces took " + i + " to reach " + FINAL_NUMBER);
		
	}
	private int evenNumber(int temp){
		int even_number = temp / 2;
		println(temp + " is even so I take half: " + even_number);
		return even_number;
	}
	private int oddNumber(int temp){
		int odd_number =  temp * 3 + 1;
		println(temp + " is odd, so I make 3n + 1: " + odd_number);
		return odd_number;
	}
}

