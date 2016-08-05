package com.denofprogramming.learnomg.domain;

import java.util.ArrayList;

public class Person {

	
	private Long id;
	private String name;
	private int age;
	ArrayList<Expertise> Expertises = new ArrayList<Expertise>();
	ArrayList<Interest> Interests = new ArrayList<Interest>();
	
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public void addExpertise(Expertise has_expertise) {
		Expertises.add(has_expertise);
		has_expertise.addPerson(this);	
	}
	
	public void addInterest(Interest has_Interest) {
		Interests.add(has_Interest);
		has_Interest.addPerson(this);	
	}
	
	
	
	public ArrayList<Expertise> getExpertises() {
		return Expertises;
	}
	public void setExpertises(ArrayList<Expertise> expertises) {
		Expertises = expertises;
	}
	public ArrayList<Interest> getInterests() {
		return Interests;
	}
	public void setInterests(ArrayList<Interest> interests) {
		Interests = interests;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", Expertises=" + Expertises + ", Interests=" + Interests
				+ "]";
	}
	
	
	
	
	
	
	
}
