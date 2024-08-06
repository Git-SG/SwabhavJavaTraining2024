package com.aurionpro.decorator.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
	}
	
	@Override
	public String getName() {
		return super.getName() + "- golden";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 100;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " which is golden";
	}
	
	

}
