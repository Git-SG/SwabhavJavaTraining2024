package com.aurionpro.model;

public class BankTransferPayment extends Payments{

	@Override
	public void payBill() {
		System.out.println("Bill Paid from Bank Transfer");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed from Bank Transfer");
		
	}

}
