package com.hand.facade_pattern.service.impl;

import com.hand.facade_pattern.service.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape : Circle");

	}

}
