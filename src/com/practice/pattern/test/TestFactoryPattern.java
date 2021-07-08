package com.practice.pattern.test;

import com.practice.pattern.factory.Automobile;
import com.practice.pattern.factory.AutomobileFactory;

public class TestFactoryPattern {
	
	public static void main(String[] args) {
		Automobile automobile = null;
		AutomobileFactory factory= new AutomobileFactory();
		automobile = factory.createAutomobile("Car");
		automobile.build();
		automobile = factory.createAutomobile("Bike");
		automobile.build();
		automobile = factory.createAutomobile("Truck");
		automobile.build();
	}

}
