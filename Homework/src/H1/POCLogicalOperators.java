package H1;

import java.util.*;

public class POCLogicalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first boolean: ");
		boolean boolean1 = sc.nextBoolean();
		System.out.println("Enter the second boolean: ");
		boolean boolean2 = sc.nextBoolean();
		
		System.out.println("Logical AND: " + boolean1 + " && " + boolean2 + " --> " + (boolean1 && boolean2));
		System.out.println("Logical OR: " + boolean1 + " || " + boolean2 + " --> " + (boolean1 || boolean2));
		System.out.println("Logical NOT: !(" + boolean1 + ") --> " + (!boolean1) + " (for first boolean)" );

	}

}
