package com.hand.observer_pattern.util;

import java.util.ArrayList;
import java.util.List;

import com.hand.observer_pattern.service.Observer;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObervers();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObervers(){
		for (Observer observer: observers) {
			observer.update();
		}
	}
}
