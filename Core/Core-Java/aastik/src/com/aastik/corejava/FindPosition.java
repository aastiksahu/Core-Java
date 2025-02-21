package com.aastik.corejava;

public class FindPosition {

	public static void main(String[] args) {
		int[] n = { 5, 4, 4, 2, 1 };

		int a = 3;

		int temp = -1;

		for (int i = 0; i < n.length; i++) {

			if (a == n[i]) {

				temp = i;
				System.out.println(temp);

			}

		}

		if (temp == -1) {
			System.out.println(temp);
		}
	}
}