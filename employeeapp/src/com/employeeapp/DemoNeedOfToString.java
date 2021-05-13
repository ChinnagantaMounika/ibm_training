package com.employeeapp;

class Fruit extends Object{
	
	private String name;
	private double price;
	
	public Fruit(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void print() {
		System.out.println("fruit name: "+ name);
		System.out.println("fruit price: "+ price);
	}
	/*
	 * //overring of the method* public String toString() { return "fruit name: "+
	 * name + " price : "+ price; }
	 */

	
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
	
}
public class DemoNeedOfToString {
	
	public static void main(String[] args) {
		Fruit fruit=new Fruit("apple", 200);
		System.out.println(fruit);
	//	fruit.print();
		
		
	}

}
