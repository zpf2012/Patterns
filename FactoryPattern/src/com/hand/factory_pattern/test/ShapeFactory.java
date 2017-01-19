package com.hand.factory_pattern.test;

import com.hand.factory_pattern.service.Shape;
import com.hand.factory_pattern.service.impl.Circle;
import com.hand.factory_pattern.service.impl.Rectangle;
import com.hand.factory_pattern.service.impl.Square;

/**
 * 工厂模式的生产类
 * @author zhangpengfei
 *
 */
public class ShapeFactory {

	/**
	 * 根据不同的参数返回不同的类
	 * @param shapeType
	 * @return
	 */
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType == "Rectangle") {
			return new Rectangle();
		} else if (shapeType == "Square") {
			return new Square();
		} else if (shapeType == "Circle") {
			return new Circle();
		}

		return null;
	}
}
