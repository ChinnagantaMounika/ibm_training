package com.employeeapp;

//class Cal {
//	public static int add(Integer a, Integer b) {
//		System.out.println("public static int add(Integer a, Integer b)");
//		return a + b;
//	}
//
//	public static int add(int... a) {
//		System.out.println("public static int add(int... a) ");
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		return sum;
//	}
//}

class Foo{
	public void foo(Double[] o) {
		System.out.println("public void foo(Object[] o)");
	}
	public void foo(String[] o) {
		System.out.println("public void foo(String[] o)");
	}
}

public class DemoOverloading {
	public static void main(String[] args) {
		
		//String s=new String(null);
		
		Foo foo=new Foo();
		//foo.foo(null);
		//System.out.println(Cal.add(4, 5));
	}
}
