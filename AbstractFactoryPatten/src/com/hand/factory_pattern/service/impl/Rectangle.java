package com.hand.factory_pattern.service.impl;

import com.hand.factory_pattern.service.Shape;

/**
 * Rectangle(矩形)
 * @author zhangpengfei
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle:: draw() method.");

	}

}
