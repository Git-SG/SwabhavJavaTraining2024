package com.aurionpro.observer.model;

public class WhatsappNotifier implements INotifier{
	
	private Account account;

	@Override
	public void notify(Account account, String transactionType) {
		System.out.println("On WhatsApp: After " + transactionType + " Current balance after transaction is " + account.getBalance());
	}

}
