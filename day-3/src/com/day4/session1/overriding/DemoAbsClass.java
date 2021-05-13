package com.day4.session1.overriding;

abstract class A{
	private int i;
	
	public A(int i) {
		this.i=i;
	}
	abstract public void foo();
	
	public void printA() {
		System.out.println("printA of A class "+ i);
	}
}
 class B extends A{
	private int j;
	
	public B(int i, int j) {
		super(i);
		this.j=j;
	}
	@Override
	public void foo() {
		System.out.println("foo method is overriden");
	}
}

public class DemoAbsClass {
	
	public static void main(String[] args) {
		A a=new B(3,5);
		a.foo();
		a.printA();
		
	}

}
