package userInput;

public class SwapperNoScanner {
	
	public static void main(String[] args) {
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		number2 = number1 + number2;
		number1 = number2 - number1;
		number2 = number2 - number1;
		
		System.out.println("After swapping number1 is "+ number1 + " and number2 is "+ number2);
	}

}
