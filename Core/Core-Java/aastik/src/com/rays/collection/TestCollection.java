package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add("aastik");
		c.add(12);
		c.add(12.45);
		c.add(true);
		c.add('s');
		System.out.println(c);

		for (Object s : c) {

			System.out.println(s);

		}
		/* c.clear(); */
		/* System.out.println(c); */
		System.out.println(c.isEmpty());
		System.out.println(c.size());

		c.remove("aastik");
		System.out.println(c);

		System.out.println(c.contains(12));
		/* c.iterator(); */
		System.out.println(c.iterator());
		
		
	}

}
