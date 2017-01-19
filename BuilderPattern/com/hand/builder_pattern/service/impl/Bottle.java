package com.hand.builder_pattern.service.impl;

import com.hand.builder_pattern.service.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		
		return "Bottle";
	}

}
