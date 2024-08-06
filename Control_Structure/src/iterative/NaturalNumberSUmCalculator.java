package iterative;

import java.util.*;
public class NaturalNumberSUmCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		
		System.out.println("Enter last natural number: ");
		int lastNumber = sc.nextInt();
		
		if(lastNumber < 1) {
			System.out.println("Enter a valid natural number");
		}
		
		else {
			while(i<=lastNumber) {
				sum += i;
				i++;
			}
			
			System.out.println("The sum is: " + sum);
		}
	}

}
