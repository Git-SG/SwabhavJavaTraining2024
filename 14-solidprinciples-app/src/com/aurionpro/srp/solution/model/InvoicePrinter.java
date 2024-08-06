package com.aurionpro.srp.solution.model;

public class InvoicePrinter {
	
	private Invoice invoice;
	private InvoiceTaxCalculator taxCalculator;
	
	
	
	public InvoicePrinter(Invoice invoice, InvoiceTaxCalculator taxCalculator) {
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}



	public void print() {
		System.out.println("ID: " + invoice.getId());
		System.out.println("Description " + invoice.getDescription());
		System.out.println("AMount " + invoice.getAmount());
		System.out.println("Tax% " + invoice.getTax());
		System.out.println("Tax Amount: " + taxCalculator.calculateTax());
		System.out.println("Total Amount: " + (taxCalculator.calculateTax() + invoice.getAmount()));
	}

}
