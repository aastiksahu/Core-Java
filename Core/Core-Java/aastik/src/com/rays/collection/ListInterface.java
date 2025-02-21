package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// list contain multiple null values
// list contain multiple duplicate values
// order of list is natural order
public class ListInterface {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("KGF");
		list.add(55);
		list.add(true);
		list.add(55.2);
		list.add('a');
		list.add("KGF");
		list.add("KGF");
		list.add(null);
		list.add(null);
		list.add(null);
		

		System.out.println("List: " + list);

		System.out.println("-----iterator-----");

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
