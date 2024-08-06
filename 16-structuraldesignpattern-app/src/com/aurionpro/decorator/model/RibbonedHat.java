package com.aurionpro.decorator.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hat) {
		super(hat);
	}
	
	@Override
	public String getName() {
		return super.getName() + "- ribboned";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 50;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " which is ribonned";
	}

}
