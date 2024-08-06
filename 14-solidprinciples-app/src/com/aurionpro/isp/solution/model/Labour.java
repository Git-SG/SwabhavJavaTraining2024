package com.aurionpro.isp.solution.model;

public class Labour implements IWorker, IWorkable, ILunchInterval{

	@Override
	public void start() {
		System.out.println("Labour has started working");
	}

	@Override
	public void stop() {
		System.out.println("Labour has stopped working");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour is eating");
		
	}

	@Override
	public void rest() {
		System.out.println("Labour is resting");
		
	}

}
