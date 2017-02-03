package com.hand.command_pattern.service.util;

import java.util.ArrayList;
import java.util.List;

import com.hand.command_pattern.service.Order;

public class Broker {

	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrder() {
		for (Order order : orderList) {
			order.execute();
		}

		orderList.clear();
	}
}
