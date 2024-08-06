package com.aurionpro.model;

public class Car extends FourWheeler{
	
	private double price;
	
	public Car(String companyName, int mileage, double price) {
		super(companyName, mileage);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", Mileage()=" + getMileage() + ", CompanyName()=" + getCompanyName()
				+  "]";
	}
	
	

}
