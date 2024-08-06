package com.aurionpro.model;

import java.util.Scanner;

public class AccountUtils {

	Scanner scanner = new Scanner(System.in);

	public void validateOption(Integer option) {
		if (option == 1 || option == 2)
			return;


		System.out.println("Enter a valid option.(1/2) \n1.Current \n2.Savings ");
		option = scanner.nextInt();
		validateOption(option);

	}

	public void validateBalance(Double balance, Integer option) {
		if (option == 2) {
			setSavingsAccountBalance(balance);
		}

		setCurrentAccountBalance(balance);
	}

	public Double setSavingsAccountBalance(Double balance) {
		if (balance < SavingsAccount.getMinBalance()) {
			System.out.println(
					"Balance should be greater than " + SavingsAccount.getMinBalance() + " Enter balance again: ");
			balance = scanner.nextDouble();
			setSavingsAccountBalance(balance);
		}

		return balance;
	}

	public Double setCurrentAccountBalance(Double balance) {
		if (balance < 0 - CurrentAccount.getOverDraftLimit()) {
			System.out.println(
					"Balance should be greater than -" + CurrentAccount.getOverDraftLimit() + " Enter balance again: ");
			balance = scanner.nextDouble();
			setCurrentAccountBalance(balance);
		}

		return balance;
	}

	public Account createAccount(Account[] accounts, String name, Double balance, Integer option) {
		if (option == 1) {
			CurrentAccount account = new CurrentAccount(name, balance);
			return account;
		}

		SavingsAccount account = new SavingsAccount(name, balance);
		return account;
	}

	public void openMenu(Account[] accounts) {
		System.out.println("Enter account number");
		Integer accountNumber = scanner.nextInt();

		Account account = validateAccountNumber(accounts, accountNumber);
		selectAction(account, accountNumber);
		
	}
	
	public void selectAction(Account account, Integer accountNumber){
		System.out.println("Select an action to perform: \n1.Check Balance \n2.Credit \n3.Debit \n4.Exit");
		Integer action = scanner.nextInt();
		validateAction(action);
		
		switch(action) {
		case 1: System.out.println("The balance of " + accountNumber + " is " + account.getBalance());
				selectAction(account, accountNumber);
				break;
		case 2: account.credit();
				selectAction(account, accountNumber);
				break;
		case 3: account.debit();
				selectAction(account, accountNumber);
				break;
		case 4: System.out.println("Thank you");
				break;
		}
		
	}
	
	public void validateAction(Integer action) {
		switch(action) {
		case 1:
		case 2:
		case 3:
		case 4: return;
		default: System.out.println("Enter a valid option.(1/2) \n1.Current \n2.Savings ");
				 action = scanner.nextInt();
				 validateAction(action);
		}
	}

	public Account validateAccountNumber(Account[] accounts, Integer accountNumber) {

		for (Account account:accounts) {
			if (accountNumber.equals(account.getAccountNumber())){
				return account;
			}
		}
		
		System.out.println("Enter a valid account number");
		openMenu(accounts);
		return null;
	}

}
