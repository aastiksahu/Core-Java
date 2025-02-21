package com.rays.oop.polymorphism;

public class BusinessMan2 implements SocialWorker, Richman {

	@Override
	public void earnMondy() {

		System.out.println("earn money");
	}

	@Override
	public void donation() {
		System.out.println("donation");

	}

	@Override
	public void party() {
		System.out.println("party");

	}

	@Override
	public void helpToOther() {
		System.out.println("helpToOther");

	}

}
