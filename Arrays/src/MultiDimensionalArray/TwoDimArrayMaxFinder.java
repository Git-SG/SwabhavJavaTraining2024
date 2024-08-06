package MultiDimensionalArray;

import java.util.Scanner;

public class TwoDimArrayMaxFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns");
		int columns = sc.nextInt();

		int[][] matrix = new int[rows][columns];

		System.out.println("Enter numbers: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == 0 && j ==0) {
					max = matrix[0][0];
				}
				
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		
		System.out.println("The maximum number in the array is " + max);
	}

}
