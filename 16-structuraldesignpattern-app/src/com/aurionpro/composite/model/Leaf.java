package com.aurionpro.composite.model;

public class Leaf implements IComponent{

	String name;
	double price;
	
	public Leaf(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return this.price;
	}


}
