package com.hand.builder_pattern.service.impl;

import com.hand.builder_pattern.service.Packing;

public class Wrapper implements Packing{

	@Override
	public String pack() {
		return "Wrapper";
	}

}
