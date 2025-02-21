package com.rays.exceptionhandling;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(1000);
		System.out.println("Balance is = " + a.getBalance());

		a.withdrawal(2000);
		System.out.println("Balance is = " + a.getBalance());

	}

}
