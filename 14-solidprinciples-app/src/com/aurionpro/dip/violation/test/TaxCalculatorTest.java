package com.aurionpro.dip.violation.test;

import com.aurionpro.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator();
		TaxCalculator t2 = new TaxCalculator();

		t1.calculateTax(1000, 10);
		t2.calculateTax(2000, 0);

	}

}
