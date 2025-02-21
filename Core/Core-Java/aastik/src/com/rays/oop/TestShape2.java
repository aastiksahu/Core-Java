package com.rays.oop;

public class TestShape2 {

	public static void main(String[] args) {

		Shape s = new Circle(2);

		Shape s1 = new Rectangle(2, 5);
		
		Shape s2 = new Triangle(3, 5);

		System.out.println("area of Circle is :->"+s.area());
		System.out.println("area of Rectangle is :->"+s1.area());
		System.out.println("area of Triangle is :->"+ s2.area());
	}

}
