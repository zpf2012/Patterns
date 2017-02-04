package com.hand.observer_pattern.service;

import com.hand.observer_pattern.util.Subject;

public abstract class Observer {

	public Subject subject;
	public abstract void update();
}
