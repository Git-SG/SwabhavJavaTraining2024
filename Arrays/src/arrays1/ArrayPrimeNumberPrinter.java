package arrays1;

import java.util.Scanner;

public class ArrayPrimeNumberPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();

		int array[] = new int[arraySize];

		System.out.println("Enter numbers: ");

		for (int i = 0; i < arraySize; i++)
			array[i] = sc.nextInt();

		printPrimeNumbers(array, arraySize);
	}

	private static void printPrimeNumbers(int[] array, int arraySize) {
		for (int i = 0; i < arraySize; i++) {
			if (isPrime(array[i])) {
				System.out.print(array[i] + " ");
			}
		}
		
	}

	private static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}


}
