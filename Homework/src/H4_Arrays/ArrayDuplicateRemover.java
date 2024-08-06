package H4_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayDuplicateRemover {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();

		int array[] = new int[arraySize];

		System.out.println("Enter numbers: ");

		for (int i = 0; i < arraySize; i++)
			array[i] = sc.nextInt();

		int[] sortedArray = array.clone();
		Arrays.sort(sortedArray);

		int duplicateCount = 0;

		System.out.print("The duplicates are [");
		for (int i = 0; i < arraySize; i++) {
			if (i == 0) {
				continue;
			}

			if (sortedArray[i] == sortedArray[i - 1]) {
				duplicateCount++;
				System.out.print(sortedArray[i] + " ");
			}
		}

		System.out.println("] and the total number of duplicates is " + duplicateCount);

	}

}
