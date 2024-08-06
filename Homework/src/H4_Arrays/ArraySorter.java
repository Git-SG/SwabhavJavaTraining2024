package H4_Arrays;

import java.util.*;

public class ArraySorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();

		int array[] = new int[arraySize];
		System.out.println("Enter array elements ");

		for (int i = 0; i < arraySize; i++)
			array[i] = sc.nextInt();

		System.out.println("The unsorted Array is ");

		for (int i = 0; i < arraySize; i++)
			System.out.print(array[i] + " ");

//		for (int i = 0; i <= arraySize * 2; i++) {
//			for (int j = 0; j < (arraySize - 1); j++) {
//				if (array[j] > array[j + 1]) {
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
		
		int sortedArray[] = array.clone();
		Arrays.sort(sortedArray);

		System.out.println("\nThe sorted array is ");
		for (int i = 0; i < arraySize; i++)
			System.out.print(sortedArray[i] + " ");
	}

}
