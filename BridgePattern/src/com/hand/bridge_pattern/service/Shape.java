package com.hand.bridge_pattern.service;

public abstract class Shape {

	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
