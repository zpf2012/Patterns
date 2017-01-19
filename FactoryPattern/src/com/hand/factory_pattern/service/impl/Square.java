package com.hand.factory_pattern.service.impl;

import com.hand.factory_pattern.service.Shape;

/**
 * Square(正方形)
 * @author zhangpengfei
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square:: draw() method.");
		
	}

}
