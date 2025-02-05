package com.aurionpro.creational.prototype.model;

public class Student implements IPrototype{
	
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

	@Override
	public IPrototype getClone() {
		return new Student(schoolName, std, division, age, rollNumber, name);
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public int getStd() {
		return std;
	}


	public void setStd(int std) {
		this.std = std;
	}


	public char getDivision() {
		return division;
	}


	public void setDivision(char division) {
		this.division = division;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
