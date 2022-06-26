package com.employee;


public class Manager extends Employee {
	String[] project;
	public Manager(int id, String name, String department, double salary, String[] project) {
		super(id, name, department, salary);
		this.project=project;
	}

	@Override
	public void work() {
		System.out.println("Manager working");
		for (int i=0;i<project.length ;i++) {
			System.out.println(project[i]);
			
		}
	}
}
