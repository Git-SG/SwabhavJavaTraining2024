package com.aurionpro.isp.violation.model;

public class Labour implements IWorker{

	@Override
	public void startwork() {
		System.out.println("Labour has started working");
	}

	@Override
	public void stopwork() {
		System.out.println("Labour has stopped working");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour is eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Labour is drinking");
		
	}
	
	

}
