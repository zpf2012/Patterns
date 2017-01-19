package com.hand.builder_pattern.item;

import com.hand.builder_pattern.service.impl.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

}
