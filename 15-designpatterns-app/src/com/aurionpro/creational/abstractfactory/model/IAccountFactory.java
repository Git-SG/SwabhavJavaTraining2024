package com.aurionpro.creational.abstractfactory.model;

public interface IAccountFactory {
	
	IAccount createAccount(int accountNumber, String name, double balance);

}
