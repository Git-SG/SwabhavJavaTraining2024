package com.aurionpro.proxy.model;

public class Student implements IStudent {

	private String name;
	private int age;

	@Override
	public void study() {
		System.out.println(name + "is studying");
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

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
