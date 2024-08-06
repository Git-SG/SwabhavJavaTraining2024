package com.aurionpro.exception;

public class AgeNotValidException extends RuntimeException{
	
	private int age;
	
	
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}



	public String getMessage() {
		return "Age not valid: Age must be at least 18 you have entered" + age;
	}
	
}
