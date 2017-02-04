package com.hand.observer_pattern.service.impl;

import com.hand.observer_pattern.service.Observer;
import com.hand.observer_pattern.util.Subject;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.attach(this);
	}

	@Override
	public void update() {
		
		System.out.println("Hexa Oberver : "+ Integer.toHexString(subject.getState()).toUpperCase());

	}

}
