package com.hand.single_pattern.service;

/**
 * 懒汉式，线程安全
 * 能够在多线程下很好的工作，但是效率很低，99%情况下不需要同步
 * @author zhangpengfei
 *
 */
public class SynchronizedSingleton {
	
	public static SynchronizedSingleton instance;
	
	private SynchronizedSingleton(){
		
	}
	
	public static synchronized SynchronizedSingleton getInstance(){
		if(instance == null){
			instance = new SynchronizedSingleton();
		}
		
		return instance;
	}
	

}
