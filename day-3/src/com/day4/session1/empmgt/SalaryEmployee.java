package com.day4.session1.empmgt;

public class SalaryEmployee extends Employee{
	
	public SalaryEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return 0;
	}
}
