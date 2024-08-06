package com.aurionpro.creational.factory.model;

public class CarFactory {
		
	public ICar createCar(CarType type) {
		ICar car = null;
		
		if(type == CarType.MARUTI) {
			car = new Maruti();
		}
		
		if(type == CarType.MAHINDRA) {
			car = new Mahindra();
		}
		
		if(type == CarType.TATA) {
			car = new Tata();
		}
		
		return car;
		
		}

}
