package iterative;

import java.util.*;

public class DigitSumCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = sc.nextInt();
		int sum = 0;

		if (number < 0) {
			System.out.println("Enter a non negative integer");
		} else {
			while (number > 0) {
				sum += number % 10;
				number /= 10;
			}

			System.out.println("The sum of the digits is " + sum);
		}

	}

}
