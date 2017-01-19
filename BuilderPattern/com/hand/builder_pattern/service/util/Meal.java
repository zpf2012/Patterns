package com.hand.builder_pattern.service.util;

import java.util.ArrayList;
import java.util.List;

import com.hand.builder_pattern.service.Item;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f;
		for (Item item: items) {
			cost += item.price();
			
		}
		
		return cost;
	}
	
	public void showItems(){
		for (Item item: items) {
			System.out.print("Item : "+item.name());
			System.out.print(", Packing : "+item.Packing().pack());
			System.out.println(", price : "+item.price());
		}
	}
}
