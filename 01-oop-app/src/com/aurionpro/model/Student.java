package com.aurionpro.model;

public class Student {
	
	private int rollNumber;
	private String name;
	private int age;
	private double percentage;
	

	public Student() {
	}
	
	public Student(int rollNumber, String name, int age, double percentage) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	} 
	
	public char showGrade(double p) {
//		String str = Double.toString(p);
//		switch(str) {
//		double d = Double.parseDouble(str);
//		case ()
//			
//		}
		
		if(p > 75) {
			return 'A';
		}
		
		else if(p > 60) {
			return 'B';
		}
		
		else if(p > 50) {
			return 'C';
		}
		
		else if(p > 40) {
			return 'D';
		}
		
		else {
			return 'F';
		}
	}

}
