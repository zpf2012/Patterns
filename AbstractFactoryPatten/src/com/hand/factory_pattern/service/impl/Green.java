package com.hand.factory_pattern.service.impl;

import com.hand.factory_pattern.service.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
