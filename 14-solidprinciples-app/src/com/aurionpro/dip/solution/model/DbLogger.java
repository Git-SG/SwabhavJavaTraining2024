package com.aurionpro.dip.solution.model;

public class DbLogger implements ILogger{

	@Override
	public void log(String err) {
		System.out.println("From DbLogger " + err);
	}
	
}