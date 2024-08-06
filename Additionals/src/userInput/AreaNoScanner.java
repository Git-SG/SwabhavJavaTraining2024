package userInput;

public class AreaNoScanner {
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		
		double area = 3.14 * radius *radius;
		
		System.out.println("Area is " + area);
	}

}
