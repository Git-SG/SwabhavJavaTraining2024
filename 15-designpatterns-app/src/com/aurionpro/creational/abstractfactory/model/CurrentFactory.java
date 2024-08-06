package com.aurionpro.creational.abstractfactory.model;

public class CurrentFactory implements IAccountFactory{

	@Override
	public IAccount createAccount(int accountNumber, String name, double balance) {
		return new CurrentAccount(accountNumber, name, balance);
	}

}
