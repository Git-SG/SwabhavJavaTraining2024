package H1;

import java.util.*;

public class POCArithmeticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
		int number1 = sc.nextInt();
		System.out.println("Enter the second integer: ");
		int number2 = sc.nextInt();
		
		System.out.println("Addition operator: " + number1 + " + " + number2 + " = " + (number1 + number2));
		System.out.println("Subtraction operator: " + number1 + " - " + number2 + " = " + (number1 - number2));
		System.out.println("Multiplication operator: " + number1 + " * " + number2 + " = " + (number1 * number2));
		System.out.println("Division operator: " + number1 + " / " + number2 + " = " + (number1 / number2));
		System.out.println("Modulus operator: " + number1 + " % " + number2 + " = " + (number1 % number2));
		
		System.out.print("Increment operator (for first number): " + number1 + "++" + " is " );
		number1++;
		System.out.println(number1);
		
		System.out.print("Decrement operator (for second number): " + number2 + "--" + " is ");
		number2--;
		System.out.println(number2);
	}
	

}
