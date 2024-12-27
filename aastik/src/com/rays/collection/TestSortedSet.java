package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

//sorted set contain unique value
//sorted set can not contain null value
//order of sorted set is by default ascending
public class TestSortedSet {

	public static void main(String[] args) {
		SortedSet so = new TreeSet();

		so.add(10);
		so.add(20);
		so.add(30);
		so.add(40);
		so.add(45);
		so.add(50);
		so.add(10);
		so.add(5);

		System.out.println("Original Set: " + so);

		System.out.println("return first element of sorted set = " + so.first());
		System.out.println("return last element of sorted set = " + so.last());

		// Return element less than the specified value
		SortedSet headSet = so.headSet(30);
		System.out.println("headSet(30): " + headSet);

		// Return elements greater than or equal to the Specified value
		SortedSet tailSet = so.tailSet(30);
		System.out.println("TailSet(30): " + tailSet);

		// Return elements between the Specified value
		SortedSet subSet = so.subSet(20, 50);
		System.out.println("subset(20 , 50): " + subSet);

	}

}
