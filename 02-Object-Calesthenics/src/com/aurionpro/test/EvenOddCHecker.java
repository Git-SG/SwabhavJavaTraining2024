package com.aurionpro.test;

import java.util.Scanner;

public class EvenOddCHecker {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("Number is even");
			return;
		}

		System.out.println("Number is odd");

	}
}
