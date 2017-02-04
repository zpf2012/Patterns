package com.hand.state_pattern.service.impl;

import com.hand.state_pattern.service.Context;
import com.hand.state_pattern.service.State;

public class StopState implements State {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stop State";
	}

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in stop state");
		context.setState(this);
	}

}
