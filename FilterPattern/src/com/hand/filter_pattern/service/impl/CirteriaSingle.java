package com.hand.filter_pattern.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hand.filter_pattern.dto.Person;
import com.hand.filter_pattern.service.Cirteria;

public class CirteriaSingle implements Cirteria {

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> cirteriaSingle = new ArrayList<Person>();
		for(Person person: persons){
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				cirteriaSingle.add(person);
			}
		}
		return cirteriaSingle;
	}

}
