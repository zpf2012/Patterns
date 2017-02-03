package com.hand.command_pattern.test;

import com.hand.command_pattern.service.impl.BuyStock;
import com.hand.command_pattern.service.impl.SellStock;
import com.hand.command_pattern.service.util.Broker;
import com.hand.command_pattern.service.util.Stock;

public class Main {

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrder();
	}
}
