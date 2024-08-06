package com.aurionpro.srp.solution.model;

public class InvoiceTaxCalculator {
	
	private Invoice invoice;

	public InvoiceTaxCalculator(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public double calculateTax () {
		return invoice.getAmount() * invoice.getTax() / 100.0;
	}

}
