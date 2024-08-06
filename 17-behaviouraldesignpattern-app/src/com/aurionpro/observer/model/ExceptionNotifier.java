package com.aurionpro.observer.model;

import com.aurionpro.observer.exception.InsufficientFundsException;

public class ExceptionNotifier{

	public void notifyException() {
		System.out.println(new InsufficientFundsException().getMessage());		
	}
	
	

}
