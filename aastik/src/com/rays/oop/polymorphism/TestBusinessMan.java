package com.rays.oop.polymorphism;

public class TestBusinessMan {

	public static void main(String[] args) {

		Richman r = new BusinessMan2();

		r.donation();
		r.party();
		r.earnMondy();

		SocialWorker s = new BusinessMan1();

		s.helpToOther();

		BusinessMan2 b = new BusinessMan2();

		b.donation();
		b.earnMondy();
		b.party();
		b.helpToOther();

	}

}
