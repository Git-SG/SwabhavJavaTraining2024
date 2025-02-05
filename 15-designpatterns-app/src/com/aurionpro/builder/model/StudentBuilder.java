package com.aurionpro.builder.model;

public class StudentBuilder {
	
	private String schoolName;
	private int std;
	private char division;
	private int age;
	private int rollNumber;
	private String name;
	
	public StudentBuilder setSchoolName(String schoolName) {
		this.schoolName = schoolName;
		return this;
	}
	public StudentBuilder setStd(int std) {
		this.std = std;
		return this;
	}
	public StudentBuilder setDivision(char division) {
		this.division = division;
		return this;
	}
	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public StudentBuilder setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public Student getStudent() {
		return new Student(schoolName, std, division, age, rollNumber, name);
	}

}
