package com.aastik.corejava;

public class FindPositionMethod {
	public int find(int n[], int a, int temp) {

		for (int i = 0; i < n.length; i++) {

			if (a == n[i]) {

				temp = i;
				System.out.println(temp);

			}

		}
		return temp;

	}

	public static void main(String[] args) {
		FindPositionMethod f = new FindPositionMethod();
		int n[] = { 5, 4, 4, 2, 1 };
		int temp = f.find(n, 4, -1);
		if (temp == -1) {
			System.out.println(temp);
		}
	}

}
