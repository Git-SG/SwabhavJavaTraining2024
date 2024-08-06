package H5_MultiDimensionalArrays_test;

import H5_MultiDimensionalArrays_methods.RowSumCalculator;

public class RowSumCalculatorTest {
	public static void main(String[] args) {
		
		RowSumCalculator matrix = new RowSumCalculator();
		
		int[][] newMatrix = matrix.createMatrix();
		
		int rows = newMatrix.length;
		
		System.out.println("The matrix has " + rows + " rows and the sum of each row index is ");
		
		matrix.calculateRowSums(newMatrix);
	}

}
