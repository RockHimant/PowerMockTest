package com.himant.app;

public final class SingletonDemo {

	private SingletonDemo() {
		
	}
	
	private final static HelloWorld instance = new HelloWorld();
	
	public static HelloWorld getInstance() {
		return instance;
	}
	
}
