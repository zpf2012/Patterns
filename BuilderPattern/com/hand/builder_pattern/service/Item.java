package com.hand.builder_pattern.service;

/**
 * 创建基本元素接口，基本每个元素都需要实现含有相关的方法
 * @author zhangpengfei
 *
 */
public interface Item {

	public String name();
	
	//packing中有多种不同的方式
	public Packing Packing();
	
	public float price();
}
