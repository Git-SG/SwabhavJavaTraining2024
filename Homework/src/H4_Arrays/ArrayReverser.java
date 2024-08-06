package H4_Arrays;

import java.util.Scanner;

public class ArrayReverser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();

		int array[] = new int[arraySize];

		System.out.println("Enter numbers: ");

		for (int i = 0; i < arraySize; i++)
			array[i] = sc.nextInt();

		System.out.println("The reversed array is");
		int[] reversedArray = reverseArray(array);
		for (int i = 0; i < arraySize; i++)
			System.out.print(reversedArray[i] + " ");
	}

	public static int[] reverseArray(int[] array) {

		int size = array.length;
		int[] reversedArray = new int[size];

		for (int i = 0; i < size; i++) {
			reversedArray[i] = array[size - i - 1];
		}

		return reversedArray;
	}

}
