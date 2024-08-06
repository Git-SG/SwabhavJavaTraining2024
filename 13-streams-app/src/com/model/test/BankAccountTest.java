package com.model.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {

		List<BankAccount> accounts = new ArrayList<BankAccount>();
		
		accounts.add(new BankAccount(1, "Sarthak", 1000));
		accounts.add(new BankAccount(2, "Sarth", 3000));
		accounts.add(new BankAccount(3, "Gangan", 5000));
		accounts.add(new BankAccount(4, "Shashikant", 2000));
		accounts.add(new BankAccount(5, "Snehal", 10000));
		
		Optional<BankAccount>  minBalance = accounts.stream().min((BankAccount account1, BankAccount account2) -> (int)(account1.getBalance() - account2.getBalance()));
		System.out.println(minBalance);
		
		Optional<BankAccount>  maxBalance = accounts.stream().max((BankAccount account1, BankAccount account2) -> (int)(account1.getBalance() - account2.getBalance()));
		System.out.println(maxBalance);

		List<BankAccount> nameGreaterThanSix = accounts.stream().filter((BankAccount account) -> account.getName().length() > 6).collect(Collectors.toList());
		System.out.println(nameGreaterThanSix);

		Double total = accounts.stream().map(account -> account.getBalance()).reduce(0.0, (balance1,balance2)->balance1+balance2);
		System.out.println(total);
		
		
	}
	
	

}
