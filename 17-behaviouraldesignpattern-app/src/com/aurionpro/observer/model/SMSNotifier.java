package com.aurionpro.observer.model;

public class SMSNotifier implements INotifier{
	
	private Account account;

	@Override
	public void notify(Account account, String transactionType) {
		System.out.println("On SMS: After " + transactionType + " Current balance after transaction is " + account.getBalance());
	}
	
	

}
