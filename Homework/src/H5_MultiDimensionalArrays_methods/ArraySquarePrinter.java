package H5_MultiDimensionalArrays_methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySquarePrinter {

	public static int[] createArray() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements of the array");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		return array;
	}

	public static int[] calculateElementSqaures(int[] array) {

		int size = array.length;
		int[] squaredArray = new int[size];

		for (int i = 0; i < size; i++) {
			squaredArray[i] = array[i] * array[i];
		}
		
		Arrays.sort(squaredArray);
		
		return squaredArray;
	}
	
	public static void printArray(int[] array) {
		
		int size = array.length;
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
