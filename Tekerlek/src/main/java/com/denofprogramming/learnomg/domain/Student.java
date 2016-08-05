package com.denofprogramming.learnomg.domain;

public final class Student {

	
	private Long id;
	
	private String name;
	private int age;
	
	private Money budget;
	
	public Student(){		
	}
	
	public Student(final String name, final int age, final Money budget){
		this.name = name;
		this.age = age;
		this.budget = budget;
	}
	
	public int getAge() {
		return age;
	}
	
	public Money getBudget() {
		return budget;
	}

	public String getName() {
		return name;
	}

		
	@Override
	public String toString() {
		return  this.getClass().getSimpleName() + "[name=" + name + ",age=" + age + " budget=" + budget + "]";
	}
	
	
}
