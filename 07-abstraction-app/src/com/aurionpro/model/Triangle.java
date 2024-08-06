package com.aurionpro.model;

public class Triangle extends Shape{
	
	private Integer base;
	private Integer height;
	
	public void area() {
		System.out.println("The area of the triangle is "+(0.5 *base *height));
	}

}
