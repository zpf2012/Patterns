package com.hand.reponsibility_pattern.service.impl;

import com.hand.reponsibility_pattern.service.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	public void write(String message) {
		System.out.println("Standard Console:: Logger"+message);

	}

}
