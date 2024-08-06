package conditional;

import java.util.Scanner;

public class VowelCheckerUsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char character = sc.next().charAt(0);
		
//		switch(character) {
//		case 'a' : System.out.println("The character is a vowel");
//				   break;
//		case 'e' : System.out.println("The character is a vowel");
//		           break;
//		case 'i' : System.out.println("The character is a vowel");
//		   		   break;
//		case 'o' : System.out.println("The character is a vowel");
//		           break;
//		case 'u' : System.out.println("The character is a vowel");
//		           break;
//		default : System.out.println("The caracter is not a vowel");
//		}
		
		// ALTERNATIVE
		
		switch(character) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' : System.out.println("The character is a vowel");
		           break;
		default : System.out.println("The caracter is not a vowel");
		}
	}

}
