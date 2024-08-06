package com.aurionpro.creational.abstractfactory.model;

public class SavingsAccount implements IAccount{
	
	private int accountNumber;
	private String name;
	private double balance;
	private final double MIN_BALANCE = 1000.0;

	public SavingsAccount(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void credit(double amount) {
		balance += amount;
		System.out.println("After crediting, the balance is " + balance);
	}

	@Override
	public void debit(double amount) {
		
		if(amount > balance - MIN_BALANCE)
		{
			System.out.println("cannot go beyond min balance");
			return;
		}
		
		balance-=amount;
		System.out.println("After debiting, the balance is " + balance);
		
	}

}
