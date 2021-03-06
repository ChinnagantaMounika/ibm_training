package com.day4.session1.demo_final;

//final method argumens
class Emp{
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

class EmployeeSalaryProcessor{
	//what it means : that pointer pointing to object is final ie it can not point to any other object
	/// but object ie pointeed by pointer is still variable ( or not a constant)
	
	public void employeeSalaryPorocesing(final Emp emp) {
	
		emp=null;
	}
}


//class Foo {
//	private final int I=55;
//	
//	 void demo() {
//		 System.out.println(I);
//		System.out.println("demo method");
//	}
//}
//
//class Bar extends Foo {
//	
//	 void demo() {
//		System.out.println("demo method");
//	}
//}

public class DemoFinal {

	public static void main(String[] args) {

	}
}
