package com.hand.filter_pattern.service;

import java.util.List;

import com.hand.filter_pattern.dto.Person;

public interface Cirteria {

	public List<Person> meetCirteria(List<Person> persons);
}
