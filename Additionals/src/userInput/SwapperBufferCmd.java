package userInput;

public class SwapperBufferCmd {
	
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		int buffer = number1;
		number1 = number2;
		number2 = buffer;
		
		System.out.println("after swapping: first number = " + number1 + " and second number = "+ number2 );
	}

}
