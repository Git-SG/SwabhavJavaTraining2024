package com.aurionpro.model;

public class EmailValidator {
	
	public static boolean isEmailValid (String email) {
		if(email.contains("@.") || email.contains(".@")) {
			return false;
		}
		
		if (email.contains("@") && email.contains(".") ) {
			return true;
		}
		
		return false;
	}
	
	public boolean hasAtAndDot (String email) {
		if(email.contains("@.") || email.contains(".@")) {
			return false;
		}
		
		if (email.contains("@") && email.contains(".") ) {
			return true;
		}
		
		return false;
	}

}
