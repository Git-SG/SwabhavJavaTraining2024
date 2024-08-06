package H1;

import java.util.*;

public class POCComparisonOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double number1 = sc.nextDouble();
		System.out.println("Enter the second number: ");
		double number2 = sc.nextDouble();
		
		System.out.println(number1 + " == " + number2 + " --> " + (number1 == number2));
		System.out.println(number1 + " != " + number2 + " --> " + (number1 != number2));
		System.out.println(number1 + " > " + number2 + " --> " + (number1 > number2));
		System.out.println(number1 + " < " + number2 + " --> " + (number1 < number2));
		System.out.println(number1 + " >= " + number2 + " --> " + (number1 >= number2));
		System.out.println(number1 + " <= " + number2 + " --> " + (number1 <= number2));

	}

}
