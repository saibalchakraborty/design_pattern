package com.practice.pattern.test;

import com.practice.pattern.decorator.BasicCar;
import com.practice.pattern.decorator.Car;
import com.practice.pattern.decorator.Luxary;
import com.practice.pattern.decorator.Sedan;

public class TestDecoratorPattern {
	
	public static void main(String[] args) {
		Car car = new Luxary(new Sedan(new BasicCar()));
		car.drive();
	}

}
