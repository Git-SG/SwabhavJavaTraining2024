package com.aurionpro.creational.factory.model;

public class TataFactory implements ICarFactory{
	
	@Override
	public ICar createCar() {
		ICar car = new Tata();
		return car;
	}

}
