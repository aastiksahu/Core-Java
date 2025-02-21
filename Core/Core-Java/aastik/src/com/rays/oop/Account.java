package com.rays.oop;

public class Account {

	private String number;
	private String accountType;
	private Double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposite(double amount) {

		this.balance = this.balance + amount;

	}

	public void withdrwal(double amount) {

		this.balance = this.balance - amount;

	}
	
	public void fundTransfer(int amount) {
		
		this.balance = this.balance - amount;
	}
	
	public void payBill(Double amount) {
		
		this.balance = this.balance - amount;
	}
	
	

}
