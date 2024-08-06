package com.aurionpro.creational.abstractfactory.model;

public class SavingsFactory implements IAccountFactory{

	@Override
	public IAccount createAccount(int accountNumber, String name, double balance) {
		return new SavingsAccount(accountNumber, name, balance);
	}
	

}
