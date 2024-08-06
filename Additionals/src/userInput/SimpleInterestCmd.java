package userInput;

public class SimpleInterestCmd {
	public static void main(String[] args) {
		double principalAmount = Double.parseDouble(args[0]);
		double rateOfInterest = Double.parseDouble(args[1]);
		double numberOfYears = Double.parseDouble(args[2]);
		
		double simpleInterest = (principalAmount * rateOfInterest * numberOfYears)/100;
		
		System.out.println("Simple interest is " + simpleInterest);
		
	}

}
