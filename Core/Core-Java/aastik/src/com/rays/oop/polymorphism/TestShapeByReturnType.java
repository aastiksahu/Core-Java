package com.rays.oop.polymorphism;

public class TestShapeByReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		s[2] = Shape.getShape(5);

		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i].area());

		}

	}

}
