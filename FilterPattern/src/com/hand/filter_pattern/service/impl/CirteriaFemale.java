package com.hand.filter_pattern.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hand.filter_pattern.dto.Person;
import com.hand.filter_pattern.service.Cirteria;

public class CirteriaFemale implements Cirteria {

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> femaleCirteria = new ArrayList<Person>();
		for (Person person: persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE")) {
				femaleCirteria.add(person);
			}
		}
		return femaleCirteria;
	}

}
