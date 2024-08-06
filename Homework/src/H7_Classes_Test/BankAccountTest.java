package H7_Classes_Test;

import java.util.Scanner;

import H7_Classes_model.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter details for account 1: ");
		System.out.println("Enter the account number: ");
		int accountNumber1 = scanner.nextInt();
		scanner.nextLine();
//		account1.setAccountNumber(accountNumber1);
		
		System.out.println("Enter name of account holder: ");
		String name1 = scanner.nextLine();
//		account1.setName(name1);
		
		System.out.println("Enter current account balance: ");
		double balance1 = scanner.nextDouble();
//		account1.setBalance(balance1);
		
		BankAccount account1 = new BankAccount(accountNumber1, name1, balance1);
		
		account1.openMenu();
		
//		account1.withdraw();
//		account1.deposit();
				
		System.out.println("\nEnter details for account 2: ");
		System.out.println("Enter the account number: ");
		int accountNumber2 = scanner.nextInt();
		scanner.nextLine();
//		account2.setAccountNumber(accountNumber2);
		
		System.out.println("Enter name of account holder: ");
		String name2 = scanner.nextLine();
//		account2.setName(name2);
		
		System.out.println("Enter current account balance: ");
		double balance2 = scanner.nextDouble();
//		account2.setBalance(balance2);
		
		BankAccount account2 = new BankAccount(accountNumber2, name2, balance2);

		
		account2.openMenu();
		
//		account2.withdraw();
//		account2.deposit();
		
		
	}

}
