package com.hand.factory_pattern.factory;

import com.hand.factory_pattern.service.Color;
import com.hand.factory_pattern.service.Shape;
import com.hand.factory_pattern.service.impl.Circle;
import com.hand.factory_pattern.service.impl.Rectangle;
import com.hand.factory_pattern.service.impl.Square;

/**
 * 根据Shape类型返回Shape
 * Shape可选类型为： RECTANGLE, SQUARE, CIRCLE
 * @author zhangpengfei
 *
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType == "RECTANGLE") {
			return new Rectangle();
		}else if (shapeType == "SQUARE") {
			return new Square();
		}else if (shapeType == "CIRCLE") {
			return new Circle();
		}
		return null;
	}

}
