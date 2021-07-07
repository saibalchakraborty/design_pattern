package com.practice.pattern.decorator;

public class Luxary extends CarDecorator{
	
	public Luxary(Car car) {
		super(car);
	}

	@Override
	public void drive() {
		System.out.println("I provide luxary while driving");
		super.drive();
	}

}
