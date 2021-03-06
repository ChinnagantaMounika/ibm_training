package com.day2.session2.productstack;

//this program have memory leak problem, find it!
class Stack{
	private Product data[];
	private final int SIZE;
	private int index;
	
	public Stack() {
		SIZE=5;
		data=new Product[SIZE];
		index=-1;// stack is empty
	}
	public boolean isEmpty() {
		return (index==-1)?true:false;
	}
	public boolean isFull() {
		return (index==SIZE-1)?true:false;
	}
	public void push(Product val) {
		if(isFull()) {
			System.out.println("insertion is not possible");
		}else {
			data[++index]=val;
		}
	}
	public Product pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return new Product(-1, "foo", 0, 0);
		}else {
			return data[index--];//memory leak?
		}
	}
}
public class DemoStack {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(new Product(121, "tv", 67, .2));
		stack.push(new Product(11, "laptop", 70, .3));
		stack.push(new Product(100, "mouse", 1, .4));
		stack.push(new Product(1211, "printer", 20, .35));
		stack.push(new Product(8, "book", 3, .2));
		
	
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
	}
}
