package com.hand.reponsibility_pattern.service.impl;

import com.hand.reponsibility_pattern.service.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	@Override
	public void write(String message) {
		System.out.println("Error Console:: Logger: "+message);
	}

}
