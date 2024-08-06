package H8_ObjectArrays_model;

import java.util.Scanner;
import H8_ObjectArrays_model.AccountType;

public class BankAccount {

	Scanner scanner = new Scanner(System.in);

	private int accountNumber;
	private String name;
	private double balance;
	private AccountType accountType;

	public BankAccount() {
	}

	public BankAccount(int accountNumber, String name, double balance, AccountType accountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	
	
	@Override
	public String toString() {
		return "BankAccount [scanner=" + scanner + ", accountNumber=" + accountNumber + ", name=" + name + ", balance="
				+ balance + ", accountType=" + accountType + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void debit() {

		System.out.println("Enter amount to be debited: ");
		double amount = scanner.nextDouble();

		if (amount < 0) {
			System.out.println("Amount cannot be negative");
		} else if (amount > balance && accountType == 1) {
			System.out.println("Amount cannot be than balance.");
		}

		else {
			balance -= amount;
			System.out.println("After debiting, the current balance is " + balance);
		}
	}

	public void credit() {

		System.out.println("Enter amount to be credited: ");
		double amount = scanner.nextDouble();

		if (amount < 0) {
			System.out.println("Amount cannot be negative");
		}

		else {
			balance += amount;
			System.out.println("After crediting, the current balance is " + balance);
		}
	}
	
	public void display() {
		System.out.println("Bank Account Number: " + accountNumber);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		if(accountType == 1) {
			System.out.println("Account Type: " + "savings");
		}
		else {
			System.out.println("Account Type: " + "current");
		}
		System.out.println();
	}
	
	public static void openMenu(BankAccount[] accounts) {
        Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter account number for menu options: ");
			int number = scanner.nextInt();
			boolean accountPresent = false;

			for (int i = 0; i < accounts.length; i++) {
				boolean exit = false;
				if (accounts[i].getAccountNumber() == number) {
					accountPresent = true;
					accounts[i].display();
					while (!exit) {
						System.out.println(
								"\nSelect an action to perform: \n1.Check Balance \n2.Debit amount \n3.Credit amount \n4.Exit");
						int option = scanner.nextInt();

						switch (option) {
						case 1:
							System.out.println("The current balance is " + accounts[i].getBalance());
							break;
						case 2:
							accounts[i].debit();
							break;
						case 3:
							accounts[i].credit();
							break;
						case 4:
							exit = true;
							break;
						default:
							System.out.println("Select a valid option");
						}
					}
				}
			}

			if (!accountPresent) {
				System.out.println("Account not present");
			}
			else {
				break;
			}

		}
	}
	
	public static void getMaximumBalanceAccount(BankAccount[] accounts) {
		double maxBalance = 0;
		
		System.out.println("The details for account(s) with Maximum Balance are: \n");
		for(int i = 0; i < accounts.length; i++) {
			if (i == 0) {
				maxBalance = accounts[i].getBalance();
			}
			
			else if ( accounts[i].getBalance() > maxBalance) {
				maxBalance = accounts[i].getBalance();
			}
		}
		
		for(int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() == maxBalance) {
				accounts[i].display();
			}
		}
	}


}
