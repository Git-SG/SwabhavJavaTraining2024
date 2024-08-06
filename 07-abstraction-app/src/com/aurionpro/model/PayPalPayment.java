package com.aurionpro.model;

public class PayPalPayment extends Payments{

	@Override
	public void payBill() {
		System.out.println("Bill Paid from PayPal");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed from PayPal");
		
	}

}
