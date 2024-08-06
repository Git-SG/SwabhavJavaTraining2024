package com.aurionpro.decorator.model;

public abstract class HatDecorator implements IHat{
	
	IHat hat;

	public HatDecorator(IHat hat) {
		this.hat = hat;
	}

	@Override
	public String getName() {
		return hat.getName();
	}

	@Override
	public double getPrice() {
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		return hat.getDescription();
	}
	
	

}
