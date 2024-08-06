package com.aurionpro.srp.violation.model;

public class Invoice {
	
	private String id;
	private String description;
	private double amount;
	private double tax;
	public Invoice() {
	}
	public Invoice(String id, String description, double amount, double tax) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double calculateTax (double amount) {
		return amount * tax / 100.0;
	}
	
	public void print() {
		System.out.println("ID: " +id);
		System.out.println("Description " + description);
		System.out.println("AMount " + amount);
		System.out.println("Tax% " + tax);
		System.out.println("Tax Amount: " + calculateTax(amount));
		System.out.println("Total Amount: " + (calculateTax(amount) + amount));
	}
	
	

}
