package MultiDimensionalArray;

import java.util.Scanner;

public class TwoDimensionalArrayNumberSearcher {
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

		System.out.println("Enter a number ");
		int number = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (matrix[i][j] == number)
				System.out.println("The number is present at (" + i + " , " + j + ")");
			}
		}
	}

}
