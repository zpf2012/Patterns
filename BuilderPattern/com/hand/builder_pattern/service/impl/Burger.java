package com.hand.builder_pattern.service.impl;

import com.hand.builder_pattern.service.Item;
import com.hand.builder_pattern.service.Packing;

public abstract class Burger implements Item {


	@Override
	public Packing Packing() {
		
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
