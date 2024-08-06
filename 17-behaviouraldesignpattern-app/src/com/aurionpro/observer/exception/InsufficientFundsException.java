package com.aurionpro.observer.exception;

public class InsufficientFundsException extends RuntimeException{
	
	public String getMessage() {
		return "Amount cannot be greater than balance";
	}

}
