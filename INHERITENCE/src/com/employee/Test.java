package com.employee;

public class Test {
	public static void main(String[] args) {
		String[] project=new String[] {"PYTHON","OS","ML"};
		Manager m=new Manager(003, "RUTVIK", "IT", 100000, project);
		m.work();
	}
}
