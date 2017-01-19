package com.hand.builder_pattern.service.impl;

import com.hand.builder_pattern.service.Item;
import com.hand.builder_pattern.service.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing Packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
