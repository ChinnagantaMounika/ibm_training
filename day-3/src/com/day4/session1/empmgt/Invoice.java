package com.day4.session1.empmgt;

public class Invoice implements Payable{
	private int invoiceNo;
	private String name;
	private double amout;
	public Invoice(int invoiceNo, String name, double amout) {
		super();
		this.invoiceNo = invoiceNo;
		this.name = name;
		this.amout = amout;
	}
	@Override
	public double getPayment() {
		return 0;
	}
	
	
	
}
