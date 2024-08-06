package H5_MultiDimensionalArrays_test;

import java.util.Scanner;

import H5_MultiDimensionalArrays_methods.CharacterShifter;

public class CharacterShifterTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string ");
		String string = scanner.next();

		System.out.println("Enter number of shifts ");
		int shift = scanner.nextInt();

		CharacterShifter.shiftString(string, shift);
		
	}

}
