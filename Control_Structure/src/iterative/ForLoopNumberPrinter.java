package iterative;

import java.util.*;

public class ForLoopNumberPrinter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = sc.nextInt();
		
		for(int i=1; i <= number; i++) {
			System.out.println(i);
		}
	}

}
