package com.aurionpro.decorator.model;

public abstract class CarServiceDecorator implements ICarService{
	
	private ICarService car;

	public CarServiceDecorator(ICarService car) {
		this.car = car;
	}

	@Override
	public double getCost() {
		return car.getCost();
	};
	
	

}
