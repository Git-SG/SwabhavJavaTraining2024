package patterns1;

import java.util.*;

public class StarPatternPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines: ");
		int numberOfLines = sc.nextInt();
		int countOfLine = 1;
		
		if (numberOfLines > 0) {
			for (int i=0; i < numberOfLines; i++) {
				for (int j = 1; j <= countOfLine; j++) {
					System.out.print("* ");
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
