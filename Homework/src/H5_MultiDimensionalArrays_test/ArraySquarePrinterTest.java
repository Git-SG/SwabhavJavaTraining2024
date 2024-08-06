package H5_MultiDimensionalArrays_test;

import java.util.Arrays;

import H5_MultiDimensionalArrays_methods.ArraySquarePrinter;


public class ArraySquarePrinterTest {
	public static void main(String[] args) {
		
		ArraySquarePrinter arr = new ArraySquarePrinter();
		
		int[] array = arr.createArray();
		
		int[] sortedArray = array.clone();
		Arrays.sort(sortedArray);
		
		int[] squaredArray = arr.calculateElementSqaures(sortedArray);
		
		System.out.print("The squared and sorted array is ");
		
		arr.printArray(squaredArray);
	}

}
