package com.aurionpro.calculator;

public class Calculator {


	public static void addition(int a, int b) {
		int total = a+b;
		System.out.println("The sum of " + a + " and " + b + " is " + total);
	}
	
	public static void subtraction (int a, int b) {
		int total = a-b;
		System.out.println("The subtraction of " + a + " and " + b + " is " + total);
	}
	
	public static int multiplication (int a, int b) {
		int total = a*b;
		System.out.println("The multiplication of " + a + " and " + b + " is " + total);
		return total;
	}
	
	public static void division (int a, int b) {
		int total = a/b;
		System.out.println("The division of " + a + " and " + b + " is " + total);
	}
	
	public static void square (int a) {
		int total = multiplication(a, a);
		System.out.println("The square of a is " + total);
	}
}
