package com.rays.oop;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle() {

	}

	public Triangle(int b, int h) {

		this.base = b;
		this.height = h;

	}

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

	public double areaTriangle() {

		double area = (base * height) / 2;
		return area;

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

}
