package com.rays.exceptionhandling;

public class MultiCatchBlock {

	public static void main(String[] args) {

		String name = null;

		try {

			System.out.println(name.charAt(6));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception2: " + e.getMessage());
		}

	}

}
