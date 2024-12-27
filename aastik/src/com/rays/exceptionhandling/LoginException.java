package com.rays.exceptionhandling;

public class LoginException extends Exception {

	public LoginException() {

		super("invalid userId");

	}

}
