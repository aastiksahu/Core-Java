package com.rays.oop.polymorphism;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Rectangle() {

	}

	public Rectangle(int l, int w) {

		this.length = l;
		this.width = w;
	}
	
	@Override
	public String getName() {
		
		return "Rectangle";
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
