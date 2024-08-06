package com.aurionpro.test;
import com.aurionpro.model.Number;

public class NumberTest {
	public static void main(String[] args) {
		Number number1 = new Number(10);
		Number number2 = new Number(20);
		
		System.out.println("Before swapping: \nnumber1 = "+ number1.getNumber() + " number2 = "+ number2.getNumber());
		
		swapNumbers(number1, number2);
		
		System.out.println("After swapping: \nnumber1 = "+ number1.getNumber() + " number2 = "+ number2.getNumber());
	}
	
	private static void swapNumbers(Number number1, Number number2) {
		int temp = number1.getNumber();
		number1.setNumber(number2.getNumber());
		number2.setNumber(temp);
	}

}
