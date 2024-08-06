package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.ICarFactory;
import com.aurionpro.creational.factory.model.MahindraFactory;
import com.aurionpro.creational.factory.model.MarutiFactory;

public class ICarFactoryTest {
	
	public static void main(String[] args) {
		
		ICarFactory marutiFactory = new MarutiFactory();
		ICarFactory mahindraFactory = new MahindraFactory();

		
		ICar car = marutiFactory.createCar();
		car.start();
		car.stop();
		
		ICar car2 = mahindraFactory.createCar();
		car2.start();
		car2.stop();
		
	}

}
