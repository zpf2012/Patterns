package com.hand.builder_pattern.item;

import com.hand.builder_pattern.service.impl.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
