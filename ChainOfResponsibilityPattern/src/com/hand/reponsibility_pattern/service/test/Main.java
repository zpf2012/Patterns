package com.hand.reponsibility_pattern.service.test;

import com.hand.reponsibility_pattern.service.AbstractLogger;
import com.hand.reponsibility_pattern.service.impl.ConsoleLogger;
import com.hand.reponsibility_pattern.service.impl.ErrorLogger;
import com.hand.reponsibility_pattern.service.impl.FileLogger;

public class Main {

	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DUBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		System.out.println("-------------------------------------------------------------");
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
		System.out.println("-------------------------------------------------------------");
		loggerChain.logMessage(AbstractLogger.DUBUG, "This is a debug level information");
		System.out.println("-------------------------------------------------------------");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
		System.out.println("-------------------------------------------------------------");
	}
}
