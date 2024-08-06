package com.aurionpro.srp.solution.test;

import com.aurionpro.srp.solution.model.Invoice;
import com.aurionpro.srp.solution.model.InvoicePrinter;
import com.aurionpro.srp.solution.model.InvoiceTaxCalculator;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("1", "Mobile Phone", 150000, 10);
		
		InvoiceTaxCalculator taxCalculator = new InvoiceTaxCalculator(invoice);
		
		InvoicePrinter printer = new InvoicePrinter(invoice, taxCalculator);
		
		printer.print();
		
	}

}
