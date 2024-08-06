package iterative;

import java.util.*;

public class PerfectNumberChecker {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer ");
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while (i <= number/2) {
			if (number % i == 0) {
				sum += i;
			}
			i++;
		}
		
		if (sum == number) {
		System.out.println("The number is a perfect number");
		}
	}

}
