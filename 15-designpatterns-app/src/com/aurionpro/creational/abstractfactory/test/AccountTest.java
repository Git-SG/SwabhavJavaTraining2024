package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.CurrentFactory;
import com.aurionpro.creational.abstractfactory.model.IAccount;
import com.aurionpro.creational.abstractfactory.model.IAccountFactory;
import com.aurionpro.creational.abstractfactory.model.SavingsFactory;

public class AccountTest {
	public static void main(String[] args) {
		IAccountFactory savings = new SavingsFactory();
		IAccountFactory current = new CurrentFactory();
		
		IAccount account1 = current.createAccount(1, "Sarthak", 1000);
		IAccount account2 = savings.createAccount(2, "Gangan", 2000);

		account1.credit(100);
		account1.debit(2000);
		
		account2.credit(1000);
		account2.debit(5000);
	}

}
