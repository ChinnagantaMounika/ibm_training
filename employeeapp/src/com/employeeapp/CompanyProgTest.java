package com.employeeapp;

public class CompanyProgTest {
	
	public static void main(String[] args) {
		Company company=new Company("ibm", "banglore");
		company.addEmployee(new Employee(121, "amit", 40));
		company.addEmployee(new Employee(21, "suman", 20));
		company.addEmployee(new Employee(1, "indu", 4));
		company.addEmployee(new Employee(91, "tarun", 50));
		
		
		company.removeEmployee(21);
		company.printCompanyDetails();
	}

}
