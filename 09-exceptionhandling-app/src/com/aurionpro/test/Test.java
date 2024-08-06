package com.aurionpro.test;

public class Test {
	public static void main(String[] args) {
		
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			double result = number1/number2;
			System.out.println("Division is: " + result);
		}
		
		catch(ArithmeticException exception) {
			System.out.println("Wrong input for number 2. Cannot be 0");
		}
		
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Please enter exactly two numbers");
		}
		
		catch(NumberFormatException exception) {
			System.out.println("Please enter valid integers");
		}
		
		catch(Exception exception) {
			System.out.println("SOmething went wrong " + exception);
		}
		
		finally {
			System.out.println("Inside finally.closing activities.");
		}
		
		System.out.println("Exiting main");

	}

}
