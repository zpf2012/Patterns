package com.hand.factory_pattern.factory;

import com.hand.factory_pattern.service.Color;
import com.hand.factory_pattern.service.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shapeType);
}
