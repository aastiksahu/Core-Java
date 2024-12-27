package com.aastik.corejava;

public class SecondLargestno {
	public int secondlargestno(int n[], int temp, int count) {
		for (int i = 0; i < n.length; i++) {
			if (temp < n[i]) {
				count = temp;
				temp = n[i];

			}
			if (count < n[i] && temp > n[i]) {
				count = n[i];

			}

		}
		return count;

	}

	public static void main(String[] args) {
		SecondLargestno s = new SecondLargestno();
		int n[] = { 10, 20, 30, 40, 50 };
		int count = s.secondlargestno(n, 0, 0);
		System.out.println("Second Largest No. Is :-> " + count);
	}

}
