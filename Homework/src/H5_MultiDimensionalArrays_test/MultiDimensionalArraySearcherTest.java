package H5_MultiDimensionalArrays_test;

import java.util.Scanner;

import H5_MultiDimensionalArrays_methods.MultiDimensionalArraySearcher;

public class MultiDimensionalArraySearcherTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MultiDimensionalArraySearcher matrix = new MultiDimensionalArraySearcher();
		
		int[][] newMatrix = matrix.createMatrix();
		
		System.out.println("Enter the number to be checked");
		int number = scanner.nextInt();
		
		boolean hasNumber = matrix.checkNumber(newMatrix, number);
		
		if (hasNumber) {
			System.out.print(" are the positions where " + number + " is present");
		}
		
		else {
			System.out.println(number + " is not present in the array");
		}
		
	}
}
