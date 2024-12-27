package com.rays.oop;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setBorderWidth(5);
		c.setColor("red");
		c.setRadius(2);

		System.out.println("border width of circle is  = " + c.getBorderWidth());
		System.out.println("color of circle is  = " + c.getColor());
		System.out.println("Area of radius is = " + c.getRadius());

		System.out.println("area of circle is = " + c.areaCircle());
		
		System.out.println("============================================================");

		Triangle t = new Triangle();

		t.setBorderWidth(3);
		t.setColor("blue");
		t.setBase(2);
		t.setHeight(4);
		
		
		System.out.println("border width of triangle is  = " + t.getBorderWidth());
		System.out.println("color of triangle is = " + t.getColor());
		System.out.println("Base of a triangle is = " + t.getBase());
		System.out.println("Height if the triangle is = " + t.getHeight());
		
		System.out.println("Area of triangle is = " + t.areaTriangle());
		
		System.out.println("============================================================");
		
		Rectangle r = new Rectangle();
		
		r.setBorderWidth(7);
		r.setColor("green");
		r.setLength(5);
		r.setWidth(5);
		
		System.out.println("border width of Rectangle is  = " + r.getBorderWidth());
		System.out.println("color of Rectangle is = " + r.getColor());
		System.out.println("length of Rectangle is = " + r.getLength());
		System.out.println("width of Rectangle is = " + r.getWidth());
		
		System.out.println("Area of Rectangle is = " + r.areaRectangle());
		

	}

}
