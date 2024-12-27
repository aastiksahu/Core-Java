package com.rays.oop;

import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();

		p.setName("Ram");
		System.out.println(p.getName());

		p.setDob(new Date(2001, 02, 02));
		System.out.println(p.getDob());

		p.setAddress("Indore");
		System.out.println(p.getAddress());

	}

}
