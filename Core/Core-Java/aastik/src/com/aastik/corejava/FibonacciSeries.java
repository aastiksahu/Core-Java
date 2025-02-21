package com.aastik.corejava;

public class FibonacciSeries {
	public static void main(String[] args) {

		for (int i = 1, a = 0, b = 1, c; i < 10; i++) {
			c = a + b;
			System.out.print(" "+a);
			a = b;
			b = c;

		}
	}

}
