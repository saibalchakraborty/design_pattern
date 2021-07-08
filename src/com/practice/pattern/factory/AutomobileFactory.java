package com.practice.pattern.factory;

public class AutomobileFactory {
	
	public Automobile createAutomobile(String automobile) {
		if(automobile == null) {
			return null;
		}
		else if(automobile.equals("Car")) {
			return new Car();
		}
		else if(automobile.equals("Bike")) {
			return new Bike();
		}
		else if(automobile.equals("Truck")) {
			return new Truck();
		}
		return null;
	}

}
