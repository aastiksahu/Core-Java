package com.rays.exceptionhandling;

public class ParentCatchBlock {
	
	public static void main(String[] args) {

		String name = "Astik";

		try {

			System.out.println(name.charAt(6));

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}


}
