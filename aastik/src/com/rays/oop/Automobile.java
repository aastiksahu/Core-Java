package com.rays.oop;

import java.util.Random;

public class Automobile {

	private String color;
	private int Highestspeed;
	private String make;
	private int accelerator;
	private int changeGear;
	private String bikeBreak;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHighestspeed() {
		return Highestspeed;
	}

	public void setHighestspeed(int highestspeed) {
		Highestspeed = highestspeed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getAccelerator() {

		if (bikeBreak == "Not applied") {
			Random r = new Random();

			if (changeGear == 1) {

				int accelerator = r.nextInt(37);
				return accelerator;

			}

			if (changeGear == 2) {

				int accelerator = r.nextInt(74);
				return accelerator;
			}

			if (changeGear == 3) {

				int accelerator = r.nextInt(111);
				return accelerator;

			}

			if (changeGear == 4) {

				int accelerator = r.nextInt(148);
				return accelerator;

			}

			if (changeGear == 5) {

				int accelerator = r.nextInt(188);
				return accelerator;
			}
		}
		if (bikeBreak == "applied") {
			return accelerator = 0;

		}

		return accelerator;
	}

	public int getChangeGear() {
		if (bikeBreak == "applied") {
			return changeGear = 0;

		}
		return changeGear;
	}

	public void setChangeGear(int changeGear) {
		this.changeGear = changeGear;
	}

	public String getBikeBreak() {
		return bikeBreak;
	}

	public void setBikeBreak(String bikeBreak) {
		this.bikeBreak = bikeBreak;
	}

}
