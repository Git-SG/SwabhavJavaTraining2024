package iterative;

import java.util.Scanner;

public class NumberPalindromeChecker {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number: ");
			int number = sc.nextInt();
			
			int i = 0;
			int reversedNumber = 0;
			int temp = number;
			while (temp > 0) {
				reversedNumber = reversedNumber*10 + (temp % 10);
				temp = temp / 10;
				i++;
			}
			
			if (number == reversedNumber) {
				System.out.println("The number is a Palindrome");
			}
			else {
				System.out.println("The number is not a Palindrome");
			}
		}

}
