package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayment;
import com.aurionpro.model.Payments;

public class PaymentsTest {
	public static void main(String[] args) {

		Payments payment;

		payment = new CreditCardPayment();
		payment.payBill();
		payment.redeem();
		payment = new PayPalPayment();
		payment.payBill();
		payment.redeem();
		payment = new BankTransferPayment();
		payment.payBill();
		payment.redeem();

	}

}
