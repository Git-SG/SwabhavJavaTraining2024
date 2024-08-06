package MultiDimensionalArray;

import java.util.Scanner;

public class MatrixAdder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows for matrix 1");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns for matrix 1");
		int columns = sc.nextInt();
		
		System.out.println("Enter number of rows for matrix 2");
		int rows2 = sc.nextInt();

		System.out.println("Enter number of columns for matrix 2");
		int columns2 = sc.nextInt();
		
		if (rows == rows2 && columns == columns2) {

			int[][] matrix1 = new int[rows][columns];
			int[][] matrix2 = new int[rows][columns];
	
			System.out.println("Enter numbers for matrix 1: ");
	
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix1[i][j] = sc.nextInt();
				}
			}
	
			System.out.println("Enter numbers for matrix 2: ");
	
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix2[i][j] = sc.nextInt();
				}
			}
	
			int[][] sum = new int[rows][columns];
	
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					sum[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
	
			System.out.println("The resulting array is ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(sum[i][j] + "\t");
				}
				System.out.println();
			}
		
		}
		
		else System.out.println("Arrays must be of same size ");

	}

}
