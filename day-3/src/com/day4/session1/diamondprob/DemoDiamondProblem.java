package com.day4.session1.diamondprob;

interface A{
	int i=55;// public static and final: till java 1.4 : this was the way to global const in java 
					//Enum in java 5 : way to declare global const in project
	void foo();
}

interface B{
	int i=557;
	void foo();
}

class C implements A, B{
	public void foo() {
		System.out.println(A.i);
		System.out.println(B.i);
		System.out.println("one");
	}
}

public class DemoDiamondProblem {
	public static void main(String[] args) {
		
	}
}
