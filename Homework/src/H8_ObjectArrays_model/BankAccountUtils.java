package H8_ObjectArrays_model;

import java.util.Scanner;

public class BankAccountUtils {

	Scanner scanner = new Scanner(System.in);

	public void openMenu(BankAccount[] accounts) {

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
