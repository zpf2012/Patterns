package com.hand.single_pattern.service;

/**
 * 饿汉式，比较常用，但是容易产生垃圾对象
 * 没有加锁，执行效率提高，但是类加载时就初始化，浪费内存
 * @author zhangpengfei
 *
 */
public class SingleObject {

	private static SingleObject instance  = new SingleObject();
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello Single Pattern");
	}
}
