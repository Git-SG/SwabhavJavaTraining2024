package com.aurionpro.model;

public class Circle extends Shape{
	
	private Integer radius;
	
	public void area() {
		System.out.println("The area of circle is "+(3.14*radius*radius));
	}

}
