package com.hand.decorator_pattern.service.impl;

import com.hand.decorator_pattern.service.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape : Rectangle");

	}

}
