package H4_Arrays;

import java.util.Scanner;

public final class ArrayElementsSumCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();

		int array[] = new int[arraySize];
		System.out.println("Enter array elements ");

		int sum = 0;

		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}

		System.out.println("The sum of the elements is " + sum);

	}

}
