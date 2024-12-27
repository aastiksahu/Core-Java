package com.rays.collection.comparator;

import java.util.Comparator;

public class CompareByRollNo implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return o1.rollNo.compareTo(o2.rollNo);
	}
	
	

}
