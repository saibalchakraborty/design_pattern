package com.practice.pattern.singleton;

public class SingeltonImpl {
	
	private static SingeltonImpl singeltonImplInstance;
	
	private SingeltonImpl() {}
	
	public static SingeltonImpl getSingletonInstance() {
		if(singeltonImplInstance == null) {
			singeltonImplInstance = new SingeltonImpl();
			return singeltonImplInstance;
		}
		return singeltonImplInstance;
	}

}
