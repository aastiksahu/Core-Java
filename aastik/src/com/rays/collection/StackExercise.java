package com.rays.collection;

import java.util.Enumeration;
import java.util.Stack;

public class StackExercise {

	public static void main(String[] args) {

		Stack s = new Stack();
		for (char i = 'a'; i <= 'z'; i++) {

			System.out.print(s.push(i));

		}

//		Enumeration en = s.elements();
//		 
//		  while (en.hasMoreElements()) {
//		 
//		  System.out.println(">>> " + en.nextElement());
//		  
//		  }

		System.out.println("-----------------------");

		Stack s1 = new Stack();

		while (!s.isEmpty()) {

			System.out.print(s1.push(s.pop()));

		}

	}

}
