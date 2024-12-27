package com.rays.collection.equalsHashCode;

public class TestEqualHashCode {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "ram");
		Student s2 = new Student(1, "ram");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
