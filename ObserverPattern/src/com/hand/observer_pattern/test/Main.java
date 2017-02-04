package com.hand.observer_pattern.test;

import com.hand.observer_pattern.service.impl.BinaryObserver;
import com.hand.observer_pattern.service.impl.HexaObserver;
import com.hand.observer_pattern.service.impl.OctalObserver;
import com.hand.observer_pattern.util.Subject;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new OctalObserver(subject);
		new HexaObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change : 15 ");
		subject.setState(15);
		System.out.println("\nSecond state change : 10");
		subject.setState(10);
		
	}
}
