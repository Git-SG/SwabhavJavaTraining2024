package conditional;

import java.util.*;

public class PositiveOrNegativeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int number = sc.nextInt();
		
		if (number == 0) {
			System.out.println("The number is neither positive nor negtive");
		}
		
		if (number>0) {
			System.out.println("Number is positive");
		}
		
		else {
			System.out.println("Number is negative");
		}
	}

}
