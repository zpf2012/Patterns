package com.hand.prototype_pattern.service.impl;

import com.hand.prototype_pattern.service.Shape;

public class Square extends Shape{

	public Square() {
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		
	}

}
