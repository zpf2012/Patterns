package com.hand.factory_pattern.service.impl;

import com.hand.factory_pattern.service.Shape;

/**
 * Circle(圆)
 * @author zhangpengfei
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle:: draw() method.");

	}

}
