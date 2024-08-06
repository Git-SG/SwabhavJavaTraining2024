package conditional;

import java.util.Scanner;

public class SeasonChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Month Number");
		int monthNumber = sc.nextInt();
		
		switch(monthNumber) {
		case 1:
		case 10:
		case 11:
		case 12: System.out.println("The Season is Winter");
		         break;
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("The Season is Summer");
		         break;
		case 6:
		case 7:
		case 8:
		case 9: System.out.println("The Season is Monsoon");
		         break;
	    default: System.out.println("Not a Month number");
		}
	}
	

}
