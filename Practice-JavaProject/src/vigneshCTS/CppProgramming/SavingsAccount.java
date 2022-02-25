package vigneshCTS.CppProgramming;

import java.util.Scanner;


public class SavingsAccount extends BankAccount {

	
@Override
	double withdrawal(double withdrawAmount) {
		super._balance =_balance-withdrawAmount;
		return super._balance;
	}

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the balance amount");
		int balance = scan.nextInt();
		System.out.println("Enter the amount to withdraw");
		int withdrawAmt = scan.nextInt();
		
		BankAccount ba = new SavingsAccount();
		ba.setBalance(balance);
		ba.getBalance();
		double newBal=ba.withdrawal(withdrawAmt);
		
		System.out.println("Available balance : "+ (int)newBal);
		System.out.println(ba._balance);
	};
	

}
