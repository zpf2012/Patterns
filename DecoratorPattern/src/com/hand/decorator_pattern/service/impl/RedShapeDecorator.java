package com.hand.decorator_pattern.service.impl;

import com.hand.decorator_pattern.service.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}
	
	@Override
	public void draw() {
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}

	public void setRedBorder(Shape decoratorShape){
		System.out.println("Border Color: Red.");
	}
}
