package com.aurionpro.model;

public class SavingsAccount extends Account{
	
	private static final Double MIN_BALANCE = 1000.0;

	public SavingsAccount(String name, Double balance) {
		super(name, balance);
	}
	
	@Override
	public void debit() {

		System.out.println("Enter amount to be debited: ");
		Double amount = scanner.nextDouble();

		if (amount > getBalance() - MIN_BALANCE) {
			System.out.println("Balance can't go below minimum");
			return;
		}
			
		setBalance(getBalance() - amount);
	}

	public static Double getMinBalance() {
		return MIN_BALANCE;
	}
	
}
