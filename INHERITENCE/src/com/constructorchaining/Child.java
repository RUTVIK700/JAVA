package com.constructorchaining;

public class Child extends Super {
	int c;
	Child(){
		this(10);
		System.out.println("Inside No Argument CHILD Constructor");
	}
	
	Child(int c){
		super(c);
		System.out.println("Inside Argument CHILD Constructor"+c);
	}
	
	public static void main(String[] args) {
		Child v=new Child();
	}
}
