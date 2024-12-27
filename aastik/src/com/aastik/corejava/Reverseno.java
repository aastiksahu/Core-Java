package com.aastik.corejava;

public class Reverseno {
	public static void main(String[] args) {
		int a = 211;
		int r = 0;
		int rv = 0;
		int temp = a;

		while (temp > 0) {

			r = temp % 10;
			rv = (rv * 10) + r;
			temp = temp / 10;

		}

		System.out.println(rv);
	}

}
