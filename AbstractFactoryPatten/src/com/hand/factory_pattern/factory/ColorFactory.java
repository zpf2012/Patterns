package com.hand.factory_pattern.factory;

import com.hand.factory_pattern.service.Color;
import com.hand.factory_pattern.service.Shape;
import com.hand.factory_pattern.service.impl.Blue;
import com.hand.factory_pattern.service.impl.Green;
import com.hand.factory_pattern.service.impl.Red;

/**
 * 根据color 返回Color
 * color可选内容为：RED, GREEN, BLUE
 * @author zhangpengfei
 *
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if(color == null){
			return null;
		}
		if(color == "RED"){
			return new Red();
		}else if(color == "GREEN"){
			return new Green();
		}else if (color == "BLUE") {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

}
