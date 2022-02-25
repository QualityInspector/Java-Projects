package vigneshCTS.CppProgramming;

abstract class BankAccount 
{
	
double _balance;

	
	public double getBalance() {
		return _balance;
	}
	public void setBalance(int balance) {
		this._balance = balance;
	}
	
	abstract double withdrawal(double amount);
}
