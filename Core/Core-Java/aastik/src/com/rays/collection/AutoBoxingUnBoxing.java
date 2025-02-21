package com.rays.collection;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		// autoboxing
		int a = 5;

		//old
		Integer i = new Integer(a);
		
		//new
		Integer c = a;

		System.out.println(i);

		// autounboxing
		int b = i;

		System.out.println(b);

	}

}
