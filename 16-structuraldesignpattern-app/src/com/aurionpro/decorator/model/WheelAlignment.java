package com.aurionpro.decorator.model;

public class WheelAlignment extends CarServiceDecorator{

	public WheelAlignment(ICarService car) {
		super(car);
	}
	
	@Override
	public double getCost() {
		return 1500 + super.getCost();
	}
	

}
