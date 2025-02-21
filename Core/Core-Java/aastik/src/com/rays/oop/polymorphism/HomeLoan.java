package com.rays.oop.polymorphism;

public class HomeLoan {
	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		
		b[0] = new AxisBank();
		b[1] = new HdfcBank();
		b[2] = new IciciBank();
		loanEnquiry(b);
		
	}
	static void loanEnquiry(Bank [] b) {
		for (Bank bank : b) {
			String name = bank.getName();
			double rate = bank.interestRate();
			System.out.println(name + " = " + rate); 
			
		}
	}

}
