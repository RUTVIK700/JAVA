package com.constructorchaining;

public class Super {
	int x;
	Super(){
		System.out.println("inside NO argument Constructor");
	}
	
	
	Super(int x){
		this();
		this.x=x;
		System.out.println("Inside Arugment Constructor"+x);
	}
	
}
