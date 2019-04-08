package com.training.bankingApp.v4;

public class BankAccount {

	private int acctnum;
	private double rate = 0.01;
	private int balance = 0;
	private boolean isforeign = false;
	private int type;

	public BankAccount(int acctnum, int type) {
		this.acctnum = acctnum;
		this.type = type;
	}

	public int getAcctNum() {
		return acctnum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amt) {
		balance = amt;
	}

	public boolean isForeign() {
		return isforeign;
	}

	public void setForeign(boolean b) {
		isforeign = b;
	}

	public void deposit(int amt) {
		balance += amt;
	}

	public boolean hasEnoughCollateral(int loanamt) {
		if (type == 1)
			return balance >= loanamt / 2;
		else
			return balance >= 2 * loanamt / 3;
	}

	public void addInterest() {
	      if (type == 1)
	         balance += (int)(balance * rate);
	   }

	public String toString() {
		String typename = (type == 1) ? "Savings" : "Checking";
		return typename + " Account " + acctnum + ": balance=" + balance + ", is "
				+ (isforeign ? "foreign" : "domestic");
	}
}
