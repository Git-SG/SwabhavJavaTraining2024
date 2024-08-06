package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountUtils;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class AccountTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		AccountUtils utils = new AccountUtils();
		
		System.out.println("Enter number of accounts ");
		Integer numberOfAccounts = scanner.nextInt();
		
		Account[] accounts = new Account[numberOfAccounts];
		
		for(int i = 0; i < accounts.length; i++) {
			
			System.out.println("Enter account type (1/2): \n1.Current \n2.Savings");
			Integer option = scanner.nextInt();
			scanner.nextLine();
			utils.validateOption(option);
			
			System.out.println("Enter account name");
			String name = scanner.nextLine();
			System.out.println("Enter current balance");
			Double balance = scanner.nextDouble();
			utils.validateBalance(balance, option);
			
			accounts[i] = utils.createAccount(accounts, name, balance, option);
			
			System.out.println("Account number is " + accounts[i].getAccountNumber());
		}
		
		utils.openMenu(accounts);
		
	}
	

}
