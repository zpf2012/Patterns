package com.hand.prototype_pattern.service.impl;

import com.hand.prototype_pattern.service.Shape;

public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");

	}

}
