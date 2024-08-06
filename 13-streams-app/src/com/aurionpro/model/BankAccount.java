package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	
	private int accountNumber;
	private String name;
	private double balance;	
	
	
	public BankAccount(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

	

}
