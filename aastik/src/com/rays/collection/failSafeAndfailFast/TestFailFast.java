package com.rays.collection.failSafeAndfailFast;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		l.add("abc");
		l.add(52);
		l.add('c');

		// fail fast
		Iterator it = l.iterator();

		// ConcurrentModificationException
		l.add(true);

		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
