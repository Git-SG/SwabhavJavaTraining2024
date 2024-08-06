package com.aurionpro.test;

import com.aurionpro.model.IAdder;

public class IAdderTest {
	public static void main(String[] args) {
		IAdder adder = (number1, number2) -> number1+ number2;
		
		System.out.println(adder.add(5, 7));
	}

}
