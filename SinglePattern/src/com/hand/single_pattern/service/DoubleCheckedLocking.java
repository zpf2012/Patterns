package com.hand.single_pattern.service;

/**
 * 这种方式采用双锁机制，安全且在多线程情况下保持高性能
 * @author zhangpengfei
 *
 */
public class DoubleCheckedLocking {

	/**
	 * 用volatile修饰的变量，线程在每次使用变量的时候，都会读取变量修改后的最的值。
	 */
	private volatile static DoubleCheckedLocking instance;
	
	private DoubleCheckedLocking(){
		
	}
	
	public static DoubleCheckedLocking getInstance(){
		if(instance == null){
			synchronized (DoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new DoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
}
