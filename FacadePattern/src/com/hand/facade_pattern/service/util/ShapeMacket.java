package com.hand.facade_pattern.service.util;

import com.hand.facade_pattern.service.Shape;
import com.hand.facade_pattern.service.impl.Circle;
import com.hand.facade_pattern.service.impl.Rectangle;
import com.hand.facade_pattern.service.impl.Square;

public class ShapeMacket{

	Shape circle;
	Shape square;
	Shape rectangle;
	
	public ShapeMacket() {
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
}
