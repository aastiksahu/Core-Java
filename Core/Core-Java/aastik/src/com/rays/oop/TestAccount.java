package com.rays.oop;

public class TestAccount {

	public static void main(String[] args) {
	
		Account a = new Account();

		a.setAccountType("saving");
		a.setNumber("ASD34567GG");
		a.setBalance(1000.0);

		System.out.println("Acount Type = " + a.getAccountType());
		System.out.println("Account No = " + a.getNumber());
		System.out.println("Current Balance = " + a.getBalance());
		
		a.deposite(5000.0);
		System.out.println("Total Amount After Deposite : " + a.getBalance());
		
		a.withdrwal(2000.0);
		System.out.println("Total Amount after withdrawal: " + a.getBalance());
		
		a.fundTransfer(50);
		System.out.println("Total Amount after fund Transfer: " + a.getBalance());
		
		a.payBill(100.0);
		System.out.println("Total Amount after pay bill: " +a.getBalance());
		
		
		

	}

}
