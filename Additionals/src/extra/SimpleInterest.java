// principal, rate of interest, number of years
package extra;
import java.awt.image.SinglePixelPackedSampleModel;
import java.util.*;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principal amount ");
		int principalAmount = sc.nextInt();
		System.out.println("Enter the Rate of interest ");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter the number of years ");
		double numberOfYears = sc.nextDouble();
		
		double simpleInterest = (principalAmount * rateOfInterest * numberOfYears)/100;
		
		System.out.println("The simple interest for the above criteria is " + simpleInterest);
	}

}
