package test;

import java.util.*;

public class DebuggerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double number1 = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double number2 = sc.nextDouble();
		
		addition(number1, number2);
	}

	private static double addition(double number1, double number2) {
		// TODO Auto-generated method stub
		return (number1 + number2);
	}

}
