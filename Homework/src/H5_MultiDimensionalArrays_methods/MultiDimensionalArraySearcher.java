package H5_MultiDimensionalArrays_methods;

import java.util.Scanner;

public class MultiDimensionalArraySearcher {

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
	
	public static boolean checkNumber (int[][] matrix, int number) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		int rowNumber;
		int columnNumber;
		boolean hasNumber = false;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (matrix[i][j] == number) {
					rowNumber = i;
					columnNumber = j;
					hasNumber = true;
					System.out.print("(" + i + ", " + j + ") " );
				}
			}
		}
		
		if(hasNumber) {
			return true;
		}
		
		return false;
	}

}
