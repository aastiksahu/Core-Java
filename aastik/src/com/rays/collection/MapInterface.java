package com.rays.collection;

//map contain multiple duplicate values but key are unique
//map contain only one null key but contain multiple null values
//map arrange the data in sorted way //asc order

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("0", "One");
		m.put("2", "Two");
		m.put("3", "Three");
		m.put("4", "Four");
		m.put("5", "Four");
		m.put("1", "Four");
		m.put(null, 1);
		m.put(6, null);
		m.put(7, null);

		System.out.println("Map is : = " + m);
		System.out.println(m.get("3"));
		System.out.println(m.containsKey("5"));
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
		m.remove("2");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.values());
		System.out.println(m);

	}

}
