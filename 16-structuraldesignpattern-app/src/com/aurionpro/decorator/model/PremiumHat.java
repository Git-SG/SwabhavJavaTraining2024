package com.aurionpro.decorator.model;

public class PremiumHat implements IHat{
	
	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public double getPrice() {
		return 200;
	}

	@Override
	public String getDescription() {
		return "This is a premium hat";
	}

}
