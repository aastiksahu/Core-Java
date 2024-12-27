package com.rays.exceptionhandling;

public class Account {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawal(double amount) {

		if (amount > balance) {

			try {
				throw new InsufficientFund();
			} catch (InsufficientFund e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			this.balance = balance - amount;

		}

	}

	public void deposit(double amount) {

		this.balance = balance + amount;

	}

}
