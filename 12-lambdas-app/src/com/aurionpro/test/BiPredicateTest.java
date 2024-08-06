package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isGreater = (number1, number2) -> (number1 > number2);
		System.out.println(isGreater.test(5, 3));

		
//		boolean check = (5>3);
//		System.out.println(check);
	}

}
