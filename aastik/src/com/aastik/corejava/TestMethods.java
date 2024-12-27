package com.aastik.corejava;

public class TestMethods {
	public static void main(String[] args) {
		Methods m = new Methods();

		m.sum(5, 5);

		int s = m.substraction(50, 10);

		System.out.println(s);

		String str = m.greeting("Hello java");

		System.out.println(str);

	}

}
