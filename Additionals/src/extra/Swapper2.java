package extra;
import java.util.*;

public class Swapper2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number");
		int number2 = sc.nextInt();

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("after swapping: first number = " + number1 + " and second number = "+ number2 );
	}
}
