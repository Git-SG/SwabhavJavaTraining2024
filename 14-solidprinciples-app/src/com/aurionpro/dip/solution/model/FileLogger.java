package com.aurionpro.dip.solution.model;

public class FileLogger implements ILogger{

	@Override
	public void log(String err) {
		System.out.println("From File" + err);
	}
	
	

}
