package com.hand.adapter_pattern.service.impl;

import com.hand.adapter_pattern.service.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file name :"+fileName);

	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
