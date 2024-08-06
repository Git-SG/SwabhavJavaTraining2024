package patterns1;

import java.util.*;

public class NumberPatternPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines: ");
		int numberOfLines = sc.nextInt();
		int countOfLine = 0;
		int number = 1;
		
		if (numberOfLines > 0) {
			for (int i=0; i < numberOfLines; i++) {
				for (int j = 0; j <= countOfLine; j++) {
					System.out.print(number + " ");
					number++;
				}
				countOfLine++;
				System.out.println();
			}
		}
		
		else {
			System.out.println("Enter valid input");
		
		
	}
	}

}
