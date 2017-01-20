package com.hand.proxy_pattern.service.test;

import com.hand.proxy_pattern.service.Image;
import com.hand.proxy_pattern.service.impl.ProxyImage;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");
		
		image.display();
		System.out.println();
		image.display();
		
	}
}
