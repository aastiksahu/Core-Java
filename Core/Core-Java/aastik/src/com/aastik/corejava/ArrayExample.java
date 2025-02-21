package com.aastik.corejava;

public class ArrayExample {

	public static void main(String[] args) {

		int[] i = { 1, 2, 5, 6, 8 };

		System.out.println(i[1]);

		System.out.println("=============================");

		for (int a : i) {

			System.out.println(a);

		}

		System.out.println("=======================");

		for (int j = 0; j < i.length; j++) {

			System.out.println(i[j]);

		}

		System.out.println("=================");

		String[] str = { "Ram", "Shyam", "Aaman" };

		System.out.println(str.length);

		for (String str1 : str) {

			System.out.println(str1);

		}

	}

}
