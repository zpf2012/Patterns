package com.hand.command_pattern.service.impl;

import com.hand.command_pattern.service.Order;
import com.hand.command_pattern.service.util.Stock;

public class BuyStock implements Order {
	
	private Stock abcStock;
	
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}

}
