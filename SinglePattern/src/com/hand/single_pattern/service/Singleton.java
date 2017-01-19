package com.hand.single_pattern.service;

/**
 * 懒汉式，线程不安全
 * 不支持多线程，没有加synchronized，严格意义上不算是单例模式
 * @author zhangpengfei
 *
 */
public class Singleton {

	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	@SuppressWarnings("unused")
	private static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
