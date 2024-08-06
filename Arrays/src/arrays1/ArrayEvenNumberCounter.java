package arrays1;

import java.util.Scanner;

public class ArrayEvenNumberCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int arraySize = sc.nextInt();

		int array[] = new int[arraySize];

		System.out.println("Enter numbers: ");

		for (int i = 0; i < arraySize; i++)
			array[i] = sc.nextInt();
		
		int evenCount = countEvenNumbers(array, arraySize);
		
		System.out.println("There are " + evenCount + " even numbers in the array");
		
	}

	private static int countEvenNumbers(int[] array, int arraySize) {
		int count = 0;
		
		for(int i = 0; i < arraySize; i++) {
			if(array[i] % 2 == 0) {
				count++;
			}
		}
		
		return count;
	}
	

}
