package com.aastik.corejava;

public class FactorialNo {
	public static void main(String[] args) {
		int fact = 1;
		int num = 8;

		for (int i = num; i > 0; i--) {

			fact = fact * i;

		}
		
		System.out.println("Factorail no is :-> " +fact);
	}

}