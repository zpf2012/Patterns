package com.hand.reponsibility_pattern.service.impl;

import com.hand.reponsibility_pattern.service.AbstractLogger;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}
	@Override
	public void write(String message) {
		System.out.println("File Console:: Logger: "+message);

	}

}
