package com.rays.exceptionhandling;

public class UserDetails {

	public static void main(String[] args) {

		String oldu = "aastik";
		String newu = "aastik";

		if (newu == oldu) {

			try {
				
				throw new DuplicateRecord();
				
			} catch (DuplicateRecord e) {
				
				System.out.println("Exception: " + e.getMessage());
			}
		}

	}

}
