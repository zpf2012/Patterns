package com.hand.observer_pattern.service.impl;

import com.hand.observer_pattern.service.Observer;
import com.hand.observer_pattern.util.Subject;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Octal Observer : "+ Integer.toOctalString(subject.getState()));

	}

}
