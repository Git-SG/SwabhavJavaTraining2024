package H8_ObjectArrays_Test;

import java.util.Scanner;
import H8_ObjectArrays_model.AccountType;

import H8_ObjectArrays_model.BankAccount;
import H8_ObjectArrays_model.BankAccountUtils;

public class BankAccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of accounts: ");
		int numberOfAccounts = scanner.nextInt();

		BankAccount[] accounts = new BankAccount[numberOfAccounts];

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Enter Bank Account number ");
			int accountNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter name of account holder: ");
			String name = scanner.nextLine();
			System.out.println("Enter account type (1 or 2): 1.savings 2.current ");
			int option;
			AccountType accountType;
			while (true) {
				option = scanner.nextInt();
				if (option == 1) {
					accountType = AccountType.SAVINGS;
					break;
				}
				if (option == 2) {
					accountType = AccountType.CURRENT;
					break;
				}
				System.out.println("Select a valid option");
				System.out.println("Enter account type (1 or 2): 1.savings 2.current ");
			}
			System.out.println("Enter current balance: ");
			double balance;
			while (true) {
				balance = scanner.nextDouble();
				if (balance < 0 && accountType == 1) {
					System.out.println("Balance in a savings account cannot be negative");
					System.out.println("Enter current balance: ");
				}

				else {
					break;
				}
			}

			accounts[i] = new BankAccount(accountNumber, name, balance, accountType);
		}

		BankAccount.getMaximumBalanceAccount(accounts);
		BankAccount.openMenu(accounts);
		
		scanner.close();
	}

}
