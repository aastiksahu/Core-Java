package com.aastik.corejava;

public class LargestnoArray {
	public int largestnoarr(int n[], int max) {
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];

			}

		}
		return max;
	}

	public static void main(String[] args) {
		LargestnoArray l = new LargestnoArray();
		int n[] = { 10, 5, 79, 57, 45 };
		int max = l.largestnoarr(n, 0);
		System.out.println("Maximum Value of the Array is :-> " + max);
	}

}
