package iterative;

import java.util.*;

public class NumberReverser {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		int i = 0;
		int reversedNumber = 0;
		while (number > 0) {
			reversedNumber = reversedNumber*10 + (number % 10);
			number = number / 10;
			i++;
		}
		
		System.out.println("The reversed number is " + reversedNumber);
	}

}
