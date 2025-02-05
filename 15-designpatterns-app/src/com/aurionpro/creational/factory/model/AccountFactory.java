package com.aurionpro.creational.factory.model;

public class AccountFactory {

//	public IAccount createAccount(AccountType type, int accountNumber, double balance) {
//
//		IAccount account = null;
//
//		if (type == AccountType.SAVINGS)
//			account = new SavingsAccount(accountNumber, balance);
//
//		if (type == AccountType.CURRENT)
//			account = new CurrentAccount(accountNumber, balance);
//
//		return account;
//	}

	public IAccount createSavingsAccount(int accountNumber, double balance) {

		IAccount account = new SavingsAccount(accountNumber, balance);

		return account;
	}

	public IAccount createCurrentAccount(int accountNumber, double balance) {

		IAccount account = new CurrentAccount(accountNumber, balance);

		return account;
	}
}
