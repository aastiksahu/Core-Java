package com.rays.oop.polymorphism;

public class Triangle extends Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Triangle() {

	}

	public Triangle(int b, int h) {

		this.base = b;
		this.height = h;
	}
	
	@Override
	public String getName() {
		
		return "Triangle";
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

}
