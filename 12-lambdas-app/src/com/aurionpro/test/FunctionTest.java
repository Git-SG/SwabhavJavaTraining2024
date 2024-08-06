package com.aurionpro.test;

import java.lang.reflect.Method;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
		Function<Integer, Integer> squareNumber = (Integer number) -> number*number;
//		System.out.println("Square is " + squareNumber.apply(5));
		
		method(squareNumber);
		
		
		
		BiFunction<Integer, Integer, Integer> adder = (Integer number1, Integer number2) -> number1 + number2;
		System.out.println("Addition is " + adder.apply(3, 2));
	}

	private static void method(Function<Integer, Integer> squareNumber) {
		System.out.println("Square is " + squareNumber.apply(5));

	}

}
