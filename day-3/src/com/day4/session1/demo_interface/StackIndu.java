package com.day4.session1.demo_interface;
class StackIndu implements Stack{
	private int data[];
	private final int SIZE;
	private int index;
	
	public StackIndu() {
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