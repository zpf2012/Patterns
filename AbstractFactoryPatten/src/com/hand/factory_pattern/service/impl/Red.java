package com.hand.factory_pattern.service.impl;

import com.hand.factory_pattern.service.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");

	}

}
