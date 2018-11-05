package com.himant.app;

public class Application {

	public int doSomething() {
		HelloWorld instance = SingletonDemo.getInstance();
		
		if(instance != null) {
			
			System.out.println("singleton instance obtained.");
			return instance.getNumber();
		}
		
		return 0;
	}
}

