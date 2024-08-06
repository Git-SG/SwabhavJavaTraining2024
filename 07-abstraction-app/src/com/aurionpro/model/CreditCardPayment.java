package com.aurionpro.model;

public class CreditCardPayment extends Payments {

	@Override
	public void payBill() {
		System.out.println("Bill Paid from Credit Card");
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed from Credit Card");
	}

}
