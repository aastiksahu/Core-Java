package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("abc");
		v.add(1);
		v.add('c');
		v.add(5.2);
		v.add(true);
		
		System.out.println(v);
		
		System.out.println("--------------Enumeration--------------");
		Enumeration e =v.elements();
		
		while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
			
		}
	}

}
