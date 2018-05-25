/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	/** Radius of outer circle in pixels */
	private static final int OUTER_RADIUS = 72;

/** Radius of middle circle in pixels */
	private static final double MIDDLE_RADIUS = 42.8;

/** Radius of inner circle in pixels */
	private static final double INNER_RADIUS = 21.6;
	
	public void run() {
		/* You fill this in. */
		AddOutercircle(getWidth() / 2, getHeight() / 2);
		AddMiddlecircle(getWidth() / 2, getHeight() / 2);
		AddInnercircle(getWidth() / 2, getHeight() / 2);
	}
	
	private void AddOutercircle(double cx, double cy) {
		double x = cx - OUTER_RADIUS;
		double y = cy - OUTER_RADIUS;
		GOval outercircle = new GOval(x,y,OUTER_RADIUS * 2, OUTER_RADIUS * 2);
		outercircle.setFilled(true);
		outercircle.setColor(Color.RED);
		add(outercircle);
	}

	private void AddMiddlecircle(double cx, double cy) {
		double x = cx - MIDDLE_RADIUS;
		double y = cy - MIDDLE_RADIUS;
		GOval middlecircle = new GOval(x,y,MIDDLE_RADIUS * 2, MIDDLE_RADIUS * 2);
		middlecircle.setFilled(true);
		middlecircle.setColor(Color.WHITE);
		add(middlecircle);
	}
	
	private void AddInnercircle(double cx, double cy) {
		double x = cx - INNER_RADIUS;
		double y = cy - INNER_RADIUS;
		GOval innercircle = new GOval(x,y,INNER_RADIUS * 2, INNER_RADIUS * 2);
		innercircle.setFilled(true);
		innercircle.setColor(Color.RED);
		add(innercircle);
	}

}
