package com.aurionpro.model;

public class AreaCalculator {
	
	double calculateAreaOfCircle(double radius) {
		return 3.14 * radius * radius;
	}
	
	double calculateAreaOfRectangle(double length, double height) {
		return length * height;
	}
	
	double calculateAreaOfTriangle(double base, double height) {
		return 0.5 * base * height;
	}

}
