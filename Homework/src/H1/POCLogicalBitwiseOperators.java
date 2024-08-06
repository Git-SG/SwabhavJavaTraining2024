package H1;

import java.util.*;

public class POCLogicalBitwiseOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int number1 = sc.nextInt();
		System.out.println("Enter second integer: ");
		int number2 = sc.nextInt();
		
		System.out.print("Bitwise AND " + number1 + " & " + number2 + " --> " );
		System.out.println(number1 & number2);
		System.out.print("Bitwise OR " + number1 + " | " + number2 + " --> " );
		System.out.println(number1 | number2);
		
		System.out.print("Right Shift " + number1 + " >> 1 --> ");
		System.out.println(number1>>1);
		System.out.print("Left Shift " + number2 + " << 1 --> ");
		System.out.println(number2<<1);
	}

}
