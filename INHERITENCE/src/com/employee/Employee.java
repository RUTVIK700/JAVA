package com.employee;

public class Employee {
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	int id;
	String name;
	String department;
	double salary;
	
	public void work() {
		System.out.println("common work to all");
	}
	
}
