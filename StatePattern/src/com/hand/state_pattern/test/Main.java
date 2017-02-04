package com.hand.state_pattern.test;

import com.hand.state_pattern.service.Context;
import com.hand.state_pattern.service.impl.StartState;
import com.hand.state_pattern.service.impl.StopState;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println("Current State : "+ context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println("Current State : "+ context.getState().toString());
		
	}

}
