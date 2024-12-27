package com.aastik.corejava;

public class ArmstrongNo {
	public static void main(String[] args) {
		int a = 153;
		int r = 0;
		int rv = 0;
		int temp = a;
		while (temp > 0) {

			r = temp % 10;
			rv = rv + r * r * r;
			temp = temp / 10;

		}
		System.out.println(rv);
		
		if(rv == a) {
			System.out.println("Armstrong no.");
			
		}else {
			System.out.println("Not Armstrong no.");
		}

	}

}
