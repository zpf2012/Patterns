package com.hand.bridge_pattern.service.test;

import com.hand.bridge_pattern.service.Shape;
import com.hand.bridge_pattern.service.impl.Circle;
import com.hand.bridge_pattern.service.impl.GreenCircle;
import com.hand.bridge_pattern.service.impl.RedCircle;

public class BridgePatternTestDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
		Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);
		
		redCircle.draw();
		greenCircle.draw();
	}
}
