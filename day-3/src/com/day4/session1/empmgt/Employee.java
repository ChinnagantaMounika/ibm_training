package com.day4.session1.empmgt;

abstract public class Employee implements Payable{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
}
