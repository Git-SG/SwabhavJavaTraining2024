package com.aurionpro.observer.test;

import java.util.List;

import com.aurionpro.observer.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(1, "Sarthak", 1000);
		
		account.deposit(1000);
		account.withdraw(500);
		
		
		
	}

}
