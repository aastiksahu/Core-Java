package com.rays.oop.polymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle(2);
		s[1] = new Triangle(5, 5);
		s[2] = new Rectangle(5, 2);
		totalArea(s);

//		for (int i = 0; i < s.length; i++) {
//		
//			System.out.println(s[i].area());
//			
//		}
//		

	}

	static void totalArea(Shape[] s) {
		for (Shape shape : s) {
			String name = shape.getName();
			double area = shape.area();
			System.out.println(name + " = " + area);

		}

	}

}
