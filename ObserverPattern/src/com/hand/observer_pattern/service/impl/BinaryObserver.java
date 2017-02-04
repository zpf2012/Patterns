package com.hand.observer_pattern.service.impl;

import com.hand.observer_pattern.service.Observer;
import com.hand.observer_pattern.util.Subject;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String : "+Integer.toBinaryString(subject.getState()));
	}

}
