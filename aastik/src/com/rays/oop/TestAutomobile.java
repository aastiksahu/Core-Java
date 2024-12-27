package com.rays.oop;

public class TestAutomobile {
	
	public static void main(String[] args) {
		Automobile ab= new Automobile();
		
		ab.setColor("black");
		System.out.println(ab.getColor());
		
		ab.setMake("Yamaha");
		System.out.println(ab.getMake());
		
		ab.setHighestspeed(188);
		System.out.println(ab.getHighestspeed());
		
		ab.setBikeBreak("Not applied");
		System.out.println(ab.getBikeBreak());
		
		ab.setChangeGear(1);
		System.out.println(ab.getChangeGear());
		
		System.out.println(ab.getAccelerator());
		
	}

}
