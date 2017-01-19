package com.hand.single_pattern.service;

/**
 * 枚举
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 * @author zhangpengfei
 *
 */
public enum EnumSingleton {

	INSTANCE;
	
	public void method(){
		
	}
}
