package com.practice.pattern.decorator;

public class HatchBack extends CarDecorator{
	
	public HatchBack(Car car) {
		super(car);
	}

	@Override
	public void drive() {
		System.out.println("HatchBack Car");
		super.drive();
	}
	
	

}
