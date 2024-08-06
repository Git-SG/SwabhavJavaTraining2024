package com.aurionpro.dip.solution;

import com.aurionpro.dip.solution.model.DbLogger;
import com.aurionpro.dip.solution.model.FileLogger;
import com.aurionpro.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator(new DbLogger());
		t1.calculateTax(1000, 0);
		
		TaxCalculator t2 = new TaxCalculator(new FileLogger());
		t2.calculateTax(1000, 0);
	}

}
