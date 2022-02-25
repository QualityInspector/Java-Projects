package vigneshCTS.JavaProgramming.ClassesandObjects;

import java.util.Scanner;

public class AccountDetails {

	Scanner scan = new Scanner(System.in);

	public Account getAccountDetails() {

		Account account = new Account();

		System.out.println("Enter account id:");
		int accountId = scan.nextInt();
		account.setAccountId(accountId);

		System.out.println("Enter account type:");
		String accountType = scan.next();
		account.setAccountType(accountType);

		int i = 0;
		while (i < 1) {
			System.out.println("Enter balance:");
			int balance = scan.nextInt();

			if (balance > 0) {
				account.setBalance(balance);
				i++;

			} else {
				System.out.println("Balance should be positive");
				i = 0;
			}

		}

		return account;

	}

	public int getWithdrawAmount() {

		int i = 0;
		int withdrawAmount = 0;
		
		while (i < 1) {

			System.out.println("Enter amount to be withdrawn:");
			withdrawAmount = scan.nextInt();

			if (withdrawAmount > 0)
				i++;
			else {
				System.out.println("Amount should be positive");
				i = 0;
			}
		}
		return withdrawAmount;

	}

	public static void main(String[] args) {
		AccountDetails accDetails = new AccountDetails();

		Account account = accDetails.getAccountDetails();

		account.withdraw(accDetails.getWithdrawAmount());

	}

}
