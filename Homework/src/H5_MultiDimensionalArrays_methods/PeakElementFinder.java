package H5_MultiDimensionalArrays_methods;

import java.util.Scanner;

public class PeakElementFinder {
	
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
	
	public static void findPeakelements(int[] array) {
		
		int size = array.length;
		
		for(int i = 0; i < size; i++) {
			if (i == 0) {
				if (array[i] > array[i+1]) {
					System.out.print("([" + i + "]" +" --> " + array[i] + ") ");
				}
			}
			
			else if (i == size-1) {
				if (array[size-1] > array[size-2]) {
					System.out.print("([" + i + "]" +" --> " + array[i] + ") ");
				}
			}
			
			else {
				if (array[i] > array[i-1] && array[i] > array[i+1]) {
					System.out.print("([" + i + "]" +" --> " + array[i] + ") ");
				}
			}
		}
	}

}
