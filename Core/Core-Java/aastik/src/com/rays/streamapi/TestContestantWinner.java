package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {
	
	public static void main(String[] args) {
		
		List<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Ram", "9669866628"));
		list.add(new Contestant("Ram", "9669866628"));
		list.add(new Contestant("Pawan", "9479514095"));
		list.add(new Contestant("Uday", "9407126877"));
		list.add(new Contestant("Anish", "9827071414"));
		list.add(new Contestant("Kamal", "99077"));
		
		System.out.println("-------get Name--------");
		// get the name
		list.stream().map(e -> e.getName()).forEach(System.out::println);
		
		System.out.println("---------------");
		//get the phoneNo.
		list.stream().map(e -> e.getphoneNo()).forEach(System.out::println);
		
		System.out.println("-------get valid phoneNo--------");
		
		//get valid phoneNo.
		list.stream().map(e -> e.getphoneNo()).filter(e -> e.length()== 10).forEach(System.out::println);
		
		System.out.println("---------remove duplicate phoneNo----------");
		
		//remove duplicate phoneNo.
		list.stream().map(e -> e.getphoneNo()).distinct().filter(e -> e.length() == 10).forEach(System.out::println);
		System.out.println("------------------------");
		
		//shuffle phoneNo.
		list.stream().map(e ->e.getphoneNo()).distinct().filter(e -> e.length() == 10).collect(Collectors.collectingAndThen(Collectors.toList(), e ->{
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(System.out::println);
		}
		
	}

