package iterative;

import java.util.*;

public class NumberTablePrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number upto which tables should be printed");
		int number = sc.nextInt();

		for (int j = 1; j <= number ; j++) {
			
		for(int i=1; i <= 10; i++) {
			System.out.print((j * i) + " ");	
			}
		System.out.println();
		}
		
// also try with a single loop

		}
	}


