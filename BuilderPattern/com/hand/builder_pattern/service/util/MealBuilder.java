package com.hand.builder_pattern.service.util;

import com.hand.builder_pattern.item.ChickenBurger;
import com.hand.builder_pattern.item.Coke;
import com.hand.builder_pattern.item.Pepsi;
import com.hand.builder_pattern.item.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
}
