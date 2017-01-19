package com.hand.prototype_pattern.service.impl;

import com.hand.prototype_pattern.service.Shape;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}
	@Override
	public void draw() {
		System.out.println("Inside Circle:: draw() method.");

	}

}
