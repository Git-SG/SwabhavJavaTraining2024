package iterative;

import java.util.*;

public class FactorialCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		int factorial = 1;
		
		if (number < 0) {
			System.out.println("Enter a non negative integer");
		}
		
		if (number > 0) {
			for(int i=1; i<=number; i++) {
				factorial *= i;
			}
			
			System.out.println("The factorial of " + number + " is " + factorial);
		}
		
		else {
			System.out.println("The factorial of 0 is 1");
		}
	}

}
