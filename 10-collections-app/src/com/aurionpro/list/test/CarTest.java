package com.aurionpro.list.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.aurionpro.list.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of cars to be added");
		int numberOfCars = scanner.nextInt();
		
		List<Car> cars = new ArrayList<Car>();
		
		for(int i = 0; i < numberOfCars; i++) {
			
			System.out.println("Enter Car ID");
			int carId = scanner.nextInt();
			System.out.println("Enter companyName");
			String companyName = scanner.next();
			System.out.println("Enter price");
			double price = scanner.nextDouble();
			System.out.println("Enter mileage");
			int mileage = scanner.nextInt();
			
			cars.add(new Car(carId, companyName, price, mileage));
		}
		
		for(Car car: cars)
			System.out.println(car);
		
		Car.printMaximumMileage(cars);
		
		
	}

}
