package iterative;

import java.util.*;
import java.lang.Math;


public class ArmstrongNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = sc.nextInt();
		int sum = 0;
		int storedNumber = number;
		int count = 0;
		
		while(storedNumber >0) {
			count++;
			storedNumber /=10;
		}
		
		storedNumber = number;

		if (number < 0) {
			System.out.println("Enter a non negative integer");
		} else {
			while (storedNumber > 0) {
				sum += (int)Math.pow((storedNumber % 10), count);
				storedNumber /=10;
			}
			if (sum == number) {
            System.out.println(number + " is an Amrmstrong number");
			}
			
			else {
				System.out.println(number + " is not an Armstrong number.");
			}
		}

	}
	
//	public static int getDigitCount(int number) {
//		int digitCount = 0;
//		int temp = number;
//		while (temp > 0) {
//			digitCount++;
//			temp /= 10;
//		}
//		return digitCount;
//	}

}
