package com.Interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("GOOOOOOOOOOO");
	}

	@Override
	public void brake() {
		System.out.println("STOOOOOOOOOOOOOP");
	}

}
