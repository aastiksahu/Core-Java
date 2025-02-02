package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		List<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet("104", "Ram", 56, 62, 72));
		list.add(new Marksheet("102", "Priyansh", 55, 91, 63));
		list.add(new Marksheet("105", "Uday", 58, 73, 55));
		list.add(new Marksheet("103", "Aaman", 66, 85, 75));
		list.add(new Marksheet("101", "Pawan", 36, 42, 33));
		
		list.forEach(System.out::println);
		
		System.out.println("----------comparable Start-----------");

		Collections.sort(list);

		list.forEach(System.out::println);
	}

}
