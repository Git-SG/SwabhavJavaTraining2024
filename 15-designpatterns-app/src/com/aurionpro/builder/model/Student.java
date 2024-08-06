package com.aurionpro.builder.model;

public class Student {
	
	private String schoolName;
	private int std;
	private char division;
	private int age;
	private int rollNumber;
	private String name;
	
	public Student(String schoolName, int std, char division, int age, int rollNumber, String name) {
		this.schoolName = schoolName;
		this.std = std;
		this.division = division;
		this.age = age;
		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", std=" + std + ", division=" + division + ", age=" + age
				+ ", rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	
	
}
