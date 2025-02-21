package com.rays.oop;

public class BankAccount implements Cloneable {
	public double balance = 0;
	
	public BankAccount(double b) {
		balance = b;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
