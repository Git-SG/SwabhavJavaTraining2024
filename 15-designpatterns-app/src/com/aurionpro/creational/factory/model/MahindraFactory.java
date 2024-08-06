package com.aurionpro.creational.factory.model;

public class MahindraFactory implements ICarFactory{
	
	@Override
	public ICar createCar() {
		ICar car = new Mahindra();
		return car;
	}

}
