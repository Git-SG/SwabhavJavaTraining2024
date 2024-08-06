package conditional;

import java.util.*;

public class MaximumAndMinimunFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double number1 = sc.nextDouble();
		System.out.println("Enter the second number");
		double number2 = sc.nextDouble();
		
		if (number1 == number2) {
			System.out.println("Number1 and Number2 are equal");
		}
		
		if (number1 > number2) {
			System.out.println("The maximum is " + number1 + " and the minimum is " + number2);
		}
		
		else {
			System.out.println("The maximum is " + number2 + " and the minimum is " + number1);

		}
	}

}
