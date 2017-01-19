package com.hand.builder_pattern.item;

import com.hand.builder_pattern.service.impl.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
