package com.aurionpro.model;

public class Rectangle implements Shape{
	
	private Integer length;
	private Integer height;
	
	
	
	public Rectangle(Integer length, Integer height) {
		super();
		this.length = length;
		this.height = height;
	}



	public void area() {
		System.out.println("The area of rectangle is "+(length*height));
	}

}
