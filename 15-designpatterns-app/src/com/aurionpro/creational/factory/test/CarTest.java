package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarType;
import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;

public class CarTest {
	public static void main(String[] args) {
//		ICar maruti = new Maruti();
//		maruti.start();
//		maruti.stop();
//		
//		ICar tata = new Tata();
//		tata.start();
//		tata.stop();
//		
//		ICar mahindra = new Mahindra();
//		mahindra.start();
//		mahindra.stop();
		
		CarFactory factory = new CarFactory();
		
		ICar car =factory.createCar(CarType.MAHINDRA);
		car.start();
		car.stop();
		
		
		
	}

}
