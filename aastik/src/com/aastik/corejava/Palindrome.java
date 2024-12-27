package com.aastik.corejava;

public class Palindrome {
	public static void main(String[] args) {
		int a = 212;
		int r = 0;
		int rv = 0;
		int temp = a;

		while (temp > 0) {

			r = temp % 10;
			rv = (rv * 10) + r;
			temp = temp / 10;

		}
		System.out.println(rv);
		if(rv == a) {
			System.out.println("Its palindrome no.");
		}else {
			System.out.println("Not palindrome no.");
		}
	}

}
