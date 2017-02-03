package com.hand.reponsibility_pattern.service;

public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DUBUG = 2;
	public static int ERROR = 3;
	
	public int level;
	
	public AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level, String message){
		if (this.level <= level) {
			write(message);
		}
		
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}
	
	abstract public void write(String message);
}
