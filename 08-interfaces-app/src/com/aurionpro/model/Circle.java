package com.aurionpro.model;

public class Circle implements Shape{
	
private Integer radius;

	
	
	public Circle(Integer radius) {
	super();
	this.radius = radius;
}



	public void area() {
		System.out.println("The area of circle is "+(3.14*radius*radius));
	}

}
