package com.aurionpro.decorator.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 100;
	}

	@Override
	public String getDescription() {
		return "This is a standard hat";
	}
	
	

}
