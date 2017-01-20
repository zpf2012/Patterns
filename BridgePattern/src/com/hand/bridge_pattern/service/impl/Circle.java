package com.hand.bridge_pattern.service.impl;

import com.hand.bridge_pattern.service.DrawAPI;
import com.hand.bridge_pattern.service.Shape;

public class Circle extends Shape {

	private int x, y, radius;
	
	public Circle(DrawAPI drawAPI, int x, int y, int radius) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);

	}

}
