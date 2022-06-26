package com.employee;

public class Developer extends Employee {
	String[] technology;
	public Developer(int id, String name, String department, double salary, String[] technology) {
		super(id, name, department, salary);
		this.technology=technology;
	}

	@Override
	public void work() {
		System.out.println("Manager working"+technology);
		for (int i=0;i<technology.length ;i++) {
			System.out.println(technology[i]);
			
		}

	}
}
