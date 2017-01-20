package com.hand.facade_pattern.service.test;

import com.hand.facade_pattern.service.util.ShapeMacket;

public class Main {

	public static void main(String[] args) {
		ShapeMacket shapeMacket = new ShapeMacket();
	
		shapeMacket.drawCircle();
		shapeMacket.drawRectangle();
		shapeMacket.drawSquare();

	}

}
