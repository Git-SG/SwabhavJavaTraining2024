package com.aurionpro.isp.solution.model;

public class Robot implements IWorker, IWorkable{
	
	@Override
	public void start() {
		System.out.println("Robot has started working");
	}

	@Override
	public void stop() {
		System.out.println("Robot has stopped working");
		
	}

}
