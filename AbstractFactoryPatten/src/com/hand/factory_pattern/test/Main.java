package com.hand.factory_pattern.test;

import com.hand.factory_pattern.factory.AbstractFactory;
import com.hand.factory_pattern.factory.FactoryProducer;
import com.hand.factory_pattern.service.Color;
import com.hand.factory_pattern.service.ColorEnum;
import com.hand.factory_pattern.service.Shape;
import com.hand.factory_pattern.service.ShapeEnum;

public class Main {
	
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE.toString());
		shape1.draw();
		Shape shape2 = shapeFactory.getShape(ShapeEnum.SQUARE.toString());
		shape2.draw();
		Shape shape3 = shapeFactory.getShape(ShapeEnum.RECTANGLE.toString());
		shape3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color color1 = colorFactory.getColor(ColorEnum.RED.toString());
		color1.fill();
		Color color2 = colorFactory.getColor(ColorEnum.GREEN.toString());
		color2.fill();
		Color color3 = colorFactory.getColor(ColorEnum.BLUE.toString());
		color3.fill();
	}
}
