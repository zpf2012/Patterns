package com.hand.prototype_pattern.service.util;

import java.util.Hashtable;

import com.hand.prototype_pattern.service.Shape;
import com.hand.prototype_pattern.service.impl.Circle;
import com.hand.prototype_pattern.service.impl.Rectangle;
import com.hand.prototype_pattern.service.impl.Square;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cacheShape = shapeMap.get(shapeId);
		return (Shape) cacheShape.clone();
	}
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
