package com.denofprogramming.learnomg.domain;

import java.util.ArrayList;
import java.util.List;

public class Expertise {
	private Long id;

	private String name;
	private int year;
	ArrayList<Person> persons = new ArrayList<Person>();

	
	
	public Expertise(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	public Expertise() {
		super();
	}
	
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
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
		return "Expertise [name=" + name + ", year=" + year + "]";
	}
}
