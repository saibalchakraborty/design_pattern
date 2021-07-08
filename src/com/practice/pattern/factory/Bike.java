package com.practice.pattern.factory;

public class Bike implements Automobile{

	@Override
	public void build() {
		System.out.println("I ama a bike");
	}

}
