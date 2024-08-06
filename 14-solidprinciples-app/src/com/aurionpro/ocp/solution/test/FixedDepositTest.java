package com.aurionpro.ocp.solution.test;

import com.aurionpro.ocp.solution.model.DiwaliInterest;
import com.aurionpro.ocp.solution.model.FDPrinter;
import com.aurionpro.ocp.solution.model.FixedDeposit;
import com.aurionpro.ocp.solution.model.SimpleInterestCalculator;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(1, "Sarthak", 1000, 5, new DiwaliInterest());
		FDPrinter print = new FDPrinter();
		SimpleInterestCalculator calculator = new SimpleInterestCalculator();
		
		print.printDetails(fd, calculator);
		
		

	}

}
