package com.employeeapp;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private double employeeTax;
	

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public double getEmployeeTax() {
		/* Logic: 5L ---> No tax
		 * 		  10L----> 10
		 * 		  15L----> 20
		 * 		  20L----> 30
		 * 		  after 40	
		 */
		return employeeSalary*0.1;
	}
	
	public void print() {
		System.out.println("--------------------");
		System.out.println("employeeId: "+ employeeId);
		System.out.println("employeeName: "+ employeeName);
		System.out.println("employeeSalary: "+ employeeSalary);
		System.out.println("employeeTax: "+ employeeTax);
		System.out.println("--------------------");
	}
}
