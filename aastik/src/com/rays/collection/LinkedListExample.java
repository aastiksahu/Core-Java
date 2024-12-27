package com.rays.collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList fruits = new LinkedList();
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		
		System.out.println("Fruits in the list : -" + fruits);
		System.out.println("first fruit is :- "+ fruits.get(0));
		
		fruits.remove("mango");
		System.out.println("after removing mango in fruits "+ fruits);
		
		fruits.add(1, "banana");
		fruits.add(2, "others");
		
		System.out.println("after adding fruits in the particular index;= "+ fruits);
	}

}
