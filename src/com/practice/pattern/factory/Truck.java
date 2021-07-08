package com.practice.pattern.factory;

public class Truck implements Automobile {

	@Override
	public void build() {
		System.out.println("I am a Truck");
	}

}
