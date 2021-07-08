package com.practice.pattern.factory;

public class Car implements Automobile{

	@Override
	public void build() {

		System.out.println("I am a Car");
	}

}
