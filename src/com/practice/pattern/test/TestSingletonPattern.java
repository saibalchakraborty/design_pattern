package com.practice.pattern.test;

import com.practice.pattern.singleton.SingeltonImpl;

public class TestSingletonPattern {

	public static void main(String[] args) {

		SingeltonImpl instanceOne = SingeltonImpl.getSingletonInstance();
		SingeltonImpl instanceTwo = SingeltonImpl.getSingletonInstance();
		System.out.println(instanceOne == instanceTwo);
	}

}
