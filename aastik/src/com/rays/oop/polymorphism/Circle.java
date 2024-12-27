package com.rays.oop.polymorphism;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle() {

	}

	public Circle(int r) {
		this.radius = r;

	}
	
	@Override
	public String getName() {
		
		return "Circle";
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}


}
