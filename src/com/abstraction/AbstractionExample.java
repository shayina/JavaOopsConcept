package com.abstraction;

public class AbstractionExample extends Employee {
	public void findEmpId() {
		System.out.println("Employee id: 23456");
	}

	public void findEmpName() {
		System.out.println("Employee name: Almas");
	}

	public static void main(String[] args) {
		Employee emp = new AbstractionExample();
		emp.findEmpId();
		emp.findEmpName();
		emp.display();
	}

}
