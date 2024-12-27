package com.aastik.corejava;

public class PrimeNo {
	public static void main(String[] args) {
		int num = 58;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;

			}

		}
		if (count==0) {
			System.out.println(num+ " Is Prime No.");
			
		}else {
			System.out.println(num+ " Not a Prime No.");
		}
	}

}
