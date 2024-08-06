package com.aurionpro.model;

public class Triangle implements Shape, Shape2{
	
	private Integer base;
	private Integer height;
	
	
	
	public Triangle(Integer base, Integer height) {
		super();
		this.base = base;
		this.height = height;
	}



	public void area() {
		System.out.println("The area of the triangle is "+(0.5 *base *height));
	}

}
