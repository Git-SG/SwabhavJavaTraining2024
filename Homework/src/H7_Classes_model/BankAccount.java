package H7_Classes_model;

import java.util.Scanner;

public class BankAccount {

	Scanner sc = new Scanner(System.in);

	private int accountNumber;
	private String name;
	private double balance;
	

	public BankAccount() {
	}

	public BankAccount(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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

	public void withdraw() {

		System.out.println("Enter amount to be withdrawn: ");
		double amount = sc.nextDouble();

		if (amount < 0) {
			System.out.println("Amount cannot be negative");
		} else if (amount > balance) {
			System.out.println("Amount cannot be than balance.");
		}

		else {
			balance -= amount;
			System.out.println("After withdrawal, the current balance is " + balance);
		}
	}

	public void deposit() {

		System.out.println("Enter amount to be deposited: ");
		double amount = sc.nextDouble();

		if (amount < 0) {
			System.out.println("Amount cannot be negative");
		}

		else {
			balance += amount;
			System.out.println("After depositing, the current balance is " + balance);
		}
	}

	public void openMenu() {
		
		boolean exit = false;
		while (!exit) {
			System.out.println("\nSelect an action to perform: \n1.Check Balance \n2.Withdraw amount \n3.Deposit amount \n4.Exit");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("The current balance is " + balance);
				break;
			case 2:
				withdraw();
				break;
			case 3:
				deposit();
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
