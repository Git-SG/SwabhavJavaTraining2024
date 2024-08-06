package com.aurionpro.creational.factory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICar createCar() {
		ICar car = new Maruti();
		return car;
	}
	

}
