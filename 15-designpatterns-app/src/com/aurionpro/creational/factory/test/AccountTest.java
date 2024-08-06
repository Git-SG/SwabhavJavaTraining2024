package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {
	public static void main(String[] args) {
		
		AccountFactory factory = new AccountFactory();
		
		IAccount account1 = factory.createCurrentAccount(1, 1000);
		IAccount account2 = factory.createSavingsAccount(2, 2000);
		
		account1.credit(100);
		account1.debit(2000);
		
		account2.credit(1000);
		account2.debit(5000);
		
		
	}

}
