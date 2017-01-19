package com.hand.adapter_pattern.service.impl;

import com.hand.adapter_pattern.service.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file name :" + fileName);
		
	}

}
