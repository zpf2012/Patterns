package com.hand.decorator_pattern.service.impl;

import com.hand.decorator_pattern.service.Shape;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratorShape;
	
	public ShapeDecorator(Shape decoratorShape) {
		this.decoratorShape = decoratorShape;
	}
	@Override
	public void draw() {
		decoratorShape.draw();
	}

}
