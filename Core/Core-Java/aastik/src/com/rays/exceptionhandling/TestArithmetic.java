package com.rays.exceptionhandling;

public class TestArithmetic {

	public static void main(String[] args) {

		int i = 0;
		int j = 5;

		try {

			double d = j / i;
			System.out.println(d);

		} catch (ArithmeticException e) {

			System.out.println("Exception: " + e.getMessage());

		} finally {
			System.out.println("always execute.....");
		}

		System.out.println("program finish...");

	}

}
