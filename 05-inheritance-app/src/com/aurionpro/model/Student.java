package com.aurionpro.model;

public class Student extends Person {
	
	private int rollNumber;
	private double percentage;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", percentage=" + percentage + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getAddress()=" + getAddress()  + "]";
	}

	
	

}
