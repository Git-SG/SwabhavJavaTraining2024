package com.aurionpro.observer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.observer.exception.InsufficientFundsException;

public class Account {

	private int accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;
	private INotifier sms;
	private INotifier email;
	private INotifier whatsapp;
	private ExceptionNotifier exception;

	Scanner scanner = new Scanner(System.in);

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		try {
			if (balance < 0)
				throw new InsufficientFundsException();
		} catch (InsufficientFundsException exception) {
			System.out.println(exception);
		}
		this.balance = balance;
		this.notifiers = new ArrayList<INotifier>();

		askForNotifiers(scanner);
	}

	public void deposit(double amount) {
		balance += amount;
		for (INotifier notifier : notifiers)
			notifier.notify(this, "depositing");

	}

	public void withdraw(double amount) {
		if (amount > balance) {
			exception = new ExceptionNotifier();
			exception.notifyException();
			return;
		}
		
		balance -= amount;
		for (INotifier notifier : notifiers)
			notifier.notify(this, "withdrawing");

	}

	public void registerNotifier(INotifier notifier) {
		notifiers.add(notifier);
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
		try {
			if (balance < 0)
				throw new InsufficientFundsException();
		} catch (InsufficientFundsException exception) {
			System.out.println(exception);
		}
		this.balance = balance;
	}

	public void askForNotifiers(Scanner scanner) {
		System.out.println("Do you wish to opt for SMS notifications? Enter 'yes' for activation");
		String option = scanner.next();
		if (option.equalsIgnoreCase("yes")) {
			sms = new SMSNotifier();
			registerNotifier(sms);
			System.out.println("Opted for SMS Notification");
		}
		System.out.println("Do you wish to opt for Email notifications? Enter 'yes' for activation");
		option = scanner.next();
		if (option.equalsIgnoreCase("yes")) {
			email = new EmailNotifier();
			registerNotifier(email);
			System.out.println("Opted for Email Notification");
		}
		System.out.println("Do you wish to opt for Whatsapp notifications? Enter 'yes' for activation");
		option = scanner.next();
		if (option.equalsIgnoreCase("yes")) {
			whatsapp = new WhatsappNotifier();
			registerNotifier(whatsapp);
			System.out.println("Opted for WhatsApp Notification");
		}
	}

}
