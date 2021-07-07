package com.practice.pattern.decorator;

public class Sedan extends CarDecorator{
	
	public Sedan(Car car) {
		super(car);
	}

	@Override
	public void drive() {
		System.out.println("Sedan car");
		super.drive();
	}
	
	

}
