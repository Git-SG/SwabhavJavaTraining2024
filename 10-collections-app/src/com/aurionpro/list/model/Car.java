package com.aurionpro.list.model;

import java.util.List;

public class Car {
	
	private int carId;
	private String companyName;
	private double price;
	private int mileage;
	
	public Car() {
	}

	public Car(int carId, String companyName, double price, int mileage) {
		this.carId = carId;
		this.companyName = companyName;
		this.price = price;
		this.mileage = mileage;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", companyName=" + companyName + ", price=" + price + ", mileage=" + mileage
				+ "]";
	}
	
	public static int getMaximumMileage(List<Car> cars) {
		int maxMileage = 0;
		for(Car car: cars) {
//			if (car.getMileage() > maxMileage) {
//				maxMileage = car.getMileage();
//			}
			checkMileage(car, maxMileage);
		}
		
		return maxMileage;
	}
	
	public static void printMaximumMileage(List<Car> cars) {
		int maxMileage = getMaximumMileage(cars);
		for(Car car: cars) {
//			if (car.mileage == maxMileage)
//				System.out.println(car);
			printIfMaxMileage(car, maxMileage);
		}
	}
	
	public static void checkMileage (Car car, int maxMileage) {
		if (car.getMileage() > maxMileage) {
			maxMileage = car.getMileage();
		}
	}
	
	public static void printIfMaxMileage(Car car, int maxMileage) {
		if (car.getMileage() == maxMileage)
			System.out.println(car);
//	}

}
}
