package com.aurionpro.model;

import java.util.Scanner;

public class CurrentAccount extends Account {
	
	private static final Double OVER_DRAFT_LIMIT = 5000.0;
	
	Scanner scanner = new Scanner(System.in);

	public CurrentAccount(String name, Double balance) {
		super(name, balance);
	}
	
	@Override
	public void debit() {

		System.out.println("Enter amount to be debited: ");
		Double amount = scanner.nextDouble();

		if (amount > getBalance() + OVER_DRAFT_LIMIT) {
			System.out.println("Amount exceeds overdraft limit");
			return;
		}
			
		setBalance(getBalance() - amount);
	}

	public static Double getOverDraftLimit() {
		return OVER_DRAFT_LIMIT;
	}
	
	
	
	

	
}
