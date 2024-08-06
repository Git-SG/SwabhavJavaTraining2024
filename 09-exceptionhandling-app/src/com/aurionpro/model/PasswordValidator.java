package com.aurionpro.model;

public class PasswordValidator{
	
	public static boolean isPasswordValid(String password) {
		if(isPasswordLong(password) && isUpperCasePresent(password) && hasDigit(password) && hasSpecialCharacter(password)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isPasswordLong(String password) {
		if (password.length() >= 8) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isUpperCasePresent(String password) {
		char[] characters = password.toCharArray();
		for(char character: characters) {
			if (Character.isUpperCase(character)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasSpecialCharacter(String password) {
		char[] characters = password.toCharArray();
		for(char character: characters) {
			if (!(Character.isLetterOrDigit(character)) && !(Character.isWhitespace(character))) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasDigit(String password) {
		char[] characters = password.toCharArray();
		for(char character: characters) {
			if (!(Character.isDigit(character))) {
				return true;
			}
		}
		return false;
	}
}
