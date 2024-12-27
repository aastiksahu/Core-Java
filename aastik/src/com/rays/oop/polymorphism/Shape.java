package com.rays.oop.polymorphism;

public class Shape {

	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float area() {
		
		return 0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {

			return new Circle(5);

		}

		if (i == 2) {

			return new Triangle(5, 5);

		}

		if (i == 3) {

			return new Rectangle(5, 5);

		}
		return new Shape();

	}

}
