package com.aurionpro.creational.factory.model;

public class Tata implements ICar{
	
	@Override
	public void start() {
		System.out.println("Tata car starts");
	}

	@Override
	public void stop() {
		System.out.println("Tata car stops");

	}

}
