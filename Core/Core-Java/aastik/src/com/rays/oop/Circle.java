package com.rays.oop;

public class Circle extends Shape {
	private int radius;

	public Circle() {

	}
                                                     
	public Circle(int r) {

		this.radius = r;

	}


	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double areaCircle() {
		
		double area= 3.14*radius *radius;
		return area;
		
	}
	@Override
	public double area() {
		double area = 3.14 * radius * radius;                                 
		return area;
	}

}
