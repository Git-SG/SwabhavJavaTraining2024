package conditional;

import java.util.*;

public class WaterBillCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int meterCharge = 75;
		System.out.println("Enter number of units consumed: ");
		int numberOfUnits = sc.nextInt();
		
		int charge = 0;
		
		if (numberOfUnits <= 100) {
			charge = numberOfUnits * 5;
		}
		
		else{
			if(numberOfUnits > 250) {
				charge = 100*5 + 150*10 + (numberOfUnits-250) * 20;
			}
			else {
				charge = 100*5 + (numberOfUnits-100) * 10;
			}
			
		}
		
		int totalWaterBill = charge + meterCharge;
		
		System.out.println("The Total Water Bill is Rs " + totalWaterBill);
	}
}
