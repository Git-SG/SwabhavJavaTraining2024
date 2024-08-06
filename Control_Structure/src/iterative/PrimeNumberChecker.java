package iterative;

import java.util.*;

public class PrimeNumberChecker {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		if (number < 2) {
			System.out.println("The number is not a prime number");
		}
		
		else {
			int i = 2;
			while (i < number) {
				
				if(number % i == 0) {
					System.out.println("The number is not a prime number");
					break;
				}
					i++;
			}
			
			if (i==number) System.out.println("The number is a prime number");
		}
	}

}
