/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		/* You fill this in */
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			/*cy is the center top point y position of each line*/
			int cy = getHeight() - BRICK_HEIGHT * (BRICKS_IN_BASE - i);
			Addline(getWidth() / 2, cy, i+1);
		}
	}
	
	private void Addline(double cx, double cy, int line) {
		/*xleft is x position of the left first rectangle*/
		double xleft = cx - 0.5 * line * BRICK_WIDTH;
		for(int i = 0; i < line; i++) {
			double x = xleft + i * BRICK_WIDTH;
			GRect brick = new GRect (x,cy,BRICK_WIDTH,BRICK_HEIGHT);
			add(brick);
		}
	}
}

