package H4_Arrays;

import java.util.Scanner;

public class ArrayNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arraySize = 10;

		int array[] = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}

		// for(int i=0; i < arraySize; i++)
		// System.out.print(array[i] + " ");

		System.out.println("Enter a number to check if it exists in the array: ");
		int number = sc.nextInt();

		boolean numberExists = false;

		for (int i = 0; i < arraySize; i++) {
			if (number == array[i]) {
				System.out.println("The number " + number + " exists in the array");
				numberExists = true;
				break;
			}
		}

		if (!numberExists) {
			System.out.println("The number " + number + " does not exist in the array");
		}

	}

}
