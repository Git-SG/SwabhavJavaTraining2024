package conditional;

import java.util.*;

public class VowelChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char character = sc.next().charAt(0);
		
		if (character=='a' || character=='e' || character=='i' || character=='o' || character=='u' ) {
			System.out.println("Character is a vowel");
		}
		
		else {
			System.out.println("Entered character is not a vowel");
		}
		
		
		
		
		
	}

}
