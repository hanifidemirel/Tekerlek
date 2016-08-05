package com.denofprogramming.learnomg.domain;

import java.util.ArrayList;

public class Interest {
	
	private Long id;
	private String name;
	ArrayList<Person> persons = new ArrayList<Person>();

	
	
	public Interest(String name) {
		this.name = name;
	}
	public Interest() {
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPerson(Person person) {
		this.persons.add(person);
	}
	
	
	@Override
	public String toString() {
		return "Interest [id=" + id + ", name=" + name + ", persons=" + persons
				+ "]";
	}

}
