package H4_Arrays;

import java.util.Scanner;

public class MaximumElementFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size; ");
		int arraySize = sc.nextInt();

		int array[] = new int[arraySize];
		int maxNumber = 0;

		System.out.println("Enter array elements: ");

		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
			if (i == 0) {
				maxNumber = array[0];
			}

			if (array[i] > maxNumber) {
				maxNumber = array[i];
			}
		}

		System.out.println("The maximum value element of an array is " + maxNumber);

	}

}
