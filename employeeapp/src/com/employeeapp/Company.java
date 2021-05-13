package com.employeeapp;

public class Company {
	private final int EMPLOYEE_SIZE=10;
	private String companyName;
	private String companyAddress;
	//replace array with arraylist/linkedlist
	private Employee[] employees;
	private int counter;

	public Company(String companyName, String companyAddress) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.employees=new Employee[EMPLOYEE_SIZE];
		counter=0;
	}
	
	//CRUD: create read update delete: with database
	public void addEmployee(Employee employee) {
		//somehow i need to add employee to array
		if(counter>=EMPLOYEE_SIZE) {
			System.out.println("employee can not be addedd...");
		}else {
			employees[counter++]=employee;
		}
	}
	
	public void removeEmployee(int employeeId) {
		//how to implement removig of an employee
		//search the employee in the employees arrray and nullify it
		for(int i=0; i< employees.length; i++) {
			Employee employee=employees[i];
			if(employee!=null) {
				if(employee.getEmployeeId()==employeeId) {
					employees[i]=null;
				}
			}
		}
	}
	
	public void printCompanyDetails() {
		
		System.out.println("companyName: "+ companyName);
		System.out.println("companyAddress: "+ companyAddress);
		
		for(int i=0; i< employees.length; i++) {
			Employee employee=employees[i];
			if(employee!=null) {
				
				employee.print();
			}
		}
	}
	
}
