package com.aurionpro.model;

public class CreditCardPayment implements Payment {

	
	public void payBill() {
		System.out.println("Bill Paid from Credit Card");
	}

	
	public void redeem() {
		System.out.println("Redeemed from Credit Card");
	}
}
