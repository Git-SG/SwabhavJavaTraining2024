package com.aurionpro.model;

public class PayPalPayment implements Payment {
	
	public void payBill() {
		System.out.println("Bill Paid from PayPal");
		
	}

	public void redeem() {
		System.out.println("Redeemed from PayPal");
		
	}

}
