package com.rays.exceptionhandling;

public class CheckedException {

	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void dad() throws Exception {

		mom();

	}

	public static void mom() throws Exception {

		son();

	}

	public static void son() throws Exception {

		throw new Exception("make mistack.....");

	}

}
