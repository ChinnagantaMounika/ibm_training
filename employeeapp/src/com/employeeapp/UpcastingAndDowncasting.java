package com.employeeapp;
// B and C aree sublings
// B and C are compatable to A
//But B and C themself are compatble to each other
class A{
	public void foo() {
		System.out.println("foo of A class");
	}
}
class B extends A{
	public void foo() {
		System.out.println("foo of A class is overrend by B");
	}
	public void fooB() {
		System.out.println("fooB");
	}
}
class C extends A{
	public void foo() {
		System.out.println("foo of A class is overrend by C");
	}
	public void fooC() {
		System.out.println("fooC");
	}
}
public class UpcastingAndDowncasting {
	public static void main(String[] args) {
		//upcasting and downcasting : for objects
		
		A a1=new B();// upcasting 
		A a2=new C();
		
		//B b=new A(); not allowed
		
		B b=(B) a1;// hey belive me it is B
		b.foo();
		b.fooB();
		//instanceOf operator works at run (RTTI C++)
		
		if(a1 instanceof C) {
		C c=(C) a1;
		c.foo();
		c.fooC();
		
		}else
			System.out.println("not allowed");
		
//		double i=9.0400;
//		int j=(int )i;
//		System.out.println(j);
	}

}
