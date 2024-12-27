package com.rays.exceptionhandling;

public class TestLogin {

	public static void main(String[] args) {

		String userId = "abc1123";

		if (userId != "abc123") {

			try {

				throw new LoginException();

			} catch (LoginException e) {

				System.out.println("Exception: " + e.getMessage());
			}

		} else {
			System.out.println("user login successfully...");
		}

	}

}
