package com.aastik.corejava;

public class Switchcase {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		char opr = '*';

		switch (opr) {
		case '+':
			System.out.println("sum = " + (a + b));
			break;
		case '-':
			System.out.println("substraction = " + (a - b));
			break;
		case '*':
			System.out.println("multilplay = " + (a * b));
			break;

		default:
			break;
		}
	}

}
