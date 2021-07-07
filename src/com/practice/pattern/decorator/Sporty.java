package com.practice.pattern.decorator;

public class Sporty extends CarDecorator{
	
	public Sporty(Car car) {
		super(car);
	}

	@Override
	public void drive() {
		System.out.println("I provide thrill while driving");
		super.drive();
	}

}
