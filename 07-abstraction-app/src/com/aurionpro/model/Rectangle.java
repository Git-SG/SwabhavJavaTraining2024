package com.aurionpro.model;

public class Rectangle extends Shape{
	
	private Integer length;
	private Integer height;
	
	public void area() {
		System.out.println("The area of rectangle is "+(length*height));
	}
	

}
