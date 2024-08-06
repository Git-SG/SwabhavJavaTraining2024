package com.aurionpro.isp.violation.model;

public class Robot implements IWorker{
	
	@Override
	public void startwork() {
		System.out.println("Robot has started working");
	}

	@Override
	public void stopwork() {
		System.out.println("Robot has stopped working");
		
	}

	@Override
	public void eat() {
		System.out.println("Robot is eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Robot is drinking");
		
	}

}
