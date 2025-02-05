package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount{
	
	private int accountNumber;
	private double balance;
	private static final double OVERDRAFT_LIMIT = 10000.0;
	

	public CurrentAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void credit(double amount) {
		balance += amount;
		System.out.println("After crediting, the balance is " + balance);
	}

	@Override
	public void debit(double amount) {
		
		if(amount > balance + OVERDRAFT_LIMIT)
		{
			System.out.println("overdraft limit exceeded");
			return;
		}
		
		balance-=amount;
		System.out.println("After debiting, the balance is " + balance);
		
	}
	
}
