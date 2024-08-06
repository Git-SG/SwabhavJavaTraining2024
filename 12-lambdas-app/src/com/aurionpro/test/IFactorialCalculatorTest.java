package com.aurionpro.test;

import com.aurionpro.model.IFactorialCalculator;

public class IFactorialCalculatorTest {
	
	public static void main(String[] args) {
		int factorial = 1;
		IFactorialCalculator factorialCalculator = (int number) -> {
			return calculateFactorial(number);
		};
		
		System.out.println(factorialCalculator.calculateFactorial(5));
	}

	private static int calculateFactorial(int number) {
		if (number < 0)
			return -1;
		if (number == 0)
			return 1;
		int factorial = 1;
		for(int i = 1; i <=number; i++)
			factorial*= i;
		
		return factorial;
	}

}
