package com.hand.command_pattern.service.impl;

import com.hand.command_pattern.service.Order;
import com.hand.command_pattern.service.util.Stock;

public class SellStock implements Order {
	
	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();

	}

}
