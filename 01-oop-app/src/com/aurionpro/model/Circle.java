package com.aurionpro.model;

public class Circle {
	
	private double radius;
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea(double radius) {
		return 3.14 * radius * radius;
	}
	
	

}
