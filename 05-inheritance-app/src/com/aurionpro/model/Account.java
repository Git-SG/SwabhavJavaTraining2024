package com.aurionpro.model;

import java.util.Scanner;

public class Account {
	
	private static Integer nextAccountNumber = 1000;
	private Integer accountNumber;
	private String name;
	private Double balance;
	
	public Account(String name, Double balance) {
		this.accountNumber = nextAccountNumber++;
		this.name = name;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void incrementAccountNumber() {
		accountNumber++;
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void credit() {

		System.out.println("Enter amount to be credited: ");
		Double amount = scanner.nextDouble();
			
		balance += amount;
	}
	
	public void debit() {}

}
