package com.aurionpro.test;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Integer> randomNumber = () -> (int)(Math.random()*100);
		
		System.out.println("Random number is : " + randomNumber.get());
	}
}
