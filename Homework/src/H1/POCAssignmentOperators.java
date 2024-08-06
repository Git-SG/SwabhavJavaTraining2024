package H1;

import java.util.*;

public class POCAssignmentOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter an integer: ");
		int number = sc.nextInt(); 
		int storedNumber = number;
		System.out.println("For all operations, value assigned to number is " + number);
		
		number += 2; //Same as number = number + 2
		System.out.println("number += 2 ; now number = " + number + " --> (" + storedNumber + " + 2 = " + number + ")");
		
		number = storedNumber;
		number -= 3; //Same as number = number - 3
		System.out.println("number -= 3 ; now number = " + number + " --> (" + storedNumber + " - 3 = " + number + ")");
		
		number = storedNumber;
		number *= 10; //Same as number = number * 10
		System.out.println("number *= 10 ; now number = " + number + " --> (" + storedNumber + " * 10 = " + number + ")");
		
		number = storedNumber;
		number /= 2; //Same as number = number / 2
		System.out.println("number /= 2 ; now number = " + number  + " --> (" + storedNumber + " / 2 = " + number + ")");
		
		number = storedNumber;
		number %= 4; //Same as number = number % 4
		System.out.println("number %= 4 ; now number = " + number  + " --> (" + storedNumber + " % 4 = " + number + ")");
	}

}
