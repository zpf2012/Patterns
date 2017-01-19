package com.hand.prototype_pattern.service.test;

import com.hand.prototype_pattern.service.Shape;
import com.hand.prototype_pattern.service.util.ShapeCache;

public class Main {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape cloneShape1 = ShapeCache.getShape("1");
		System.out.println("Shape : "+ cloneShape1.getType());
		
		Shape cloneShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : "+ cloneShape2.getType());
		
		Shape cloneShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : "+ cloneShape3.getType());
	}
}
