package com.day2.session2.stackapp;
class Stack{
	private int data[];
	private final int SIZE;
	private int index;
	
	public Stack() {
		SIZE=5;
		data=new int[SIZE];
		index=-1;// stack is empty
	}
	public boolean isEmpty() {
		return (index==-1)?true:false;
	}
	public boolean isFull() {
		return (index==SIZE-1)?true:false;
	}
	public void push(int val) {
		if(isFull()) {
			System.out.println("insertion is not possible");
		}else {
			data[++index]=val;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -999;
		}else {
			return data[index--];
		}
	}
}
public class DemoStack {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(4);
		stack.push(49);
		stack.push(30);
		stack.push(42);
		stack.push(12);
		//stack.push(12);
		//stack.push(32);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
