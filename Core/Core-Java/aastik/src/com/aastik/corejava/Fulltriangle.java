package com.aastik.corejava;

public class Fulltriangle {
	public static void main(String[] args) {
		int k=1,l=1;
		for(int n = 5;n > 1; n--) {
			for (int i = 1; i < n; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= k ; j++) {
				System.out.print(l);
			}
			k++;
			k++;
			l++;
			System.out.println();
		}
	}

}
