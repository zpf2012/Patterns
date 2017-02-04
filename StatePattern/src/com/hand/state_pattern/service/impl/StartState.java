package com.hand.state_pattern.service.impl;

import com.hand.state_pattern.service.Context;
import com.hand.state_pattern.service.State;

public class StartState implements State {

	@Override
	public String toString() {
		return "Start State";
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in start state");
		context.setState(this);
	}

}
