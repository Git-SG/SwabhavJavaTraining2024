package conditional;

import java.util.*;

public class MaximumOfThreeNumbersFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		double number1 = sc.nextDouble();
		System.out.println("Enter the second number ");
		double number2 = sc.nextDouble();
		System.out.println("Enter the third number ");
		double number3 = sc.nextDouble();
		
		if (number1 == number2 && number2 == number3) {
			System.out.println("All the numbers are equal");
		}
		
		if (number1 > number2 && number1 > number3) {
			System.out.println("Maximum of the numbers is " + number1);
		}
		
		if (number2 > number3) {
			System.out.println("Maximum of the numbers is " + number2);
		}
		
		else {
			System.out.println("Maximum of the numbers is " + number3);
		}
		
	}

}
