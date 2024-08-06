package H5_MultiDimensionalArrays_methods;

import java.util.Scanner;

public class RowSumCalculator {

	public static int[][] createMatrix() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();

		System.out.println("Enter number of columns");
		int columns = scanner.nextInt();

		int[][] matrix = new int[rows][columns];

		System.out.println("Enter the elements of the matrix");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		return matrix;

	}
	
	public static void calculateRowSums(int[][] matrix) {
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			
			int sum = 0;
			for (int j = 0; j < columns; j++) {
				sum += matrix[i][j];
			}
			System.out.print("(" + i + " --> "+ sum + ") ");
		}
	}
	
	

}
