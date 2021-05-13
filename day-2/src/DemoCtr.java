//Singleton design pattern?

//if ctr is priviate we can not call it 
//but we can do? we can create object of that class inside it

class Foo{
	private static Foo foo=new Foo();
	private Foo(){
		System.out.println("dare to call me!");
	}
	public void logic() {
		System.out.println("some logic");
	}
	//static method
	public static Foo getFoo() {
		return foo;
	}
}
public class DemoCtr {

	public static void main(String[] args) {
		Foo foo=Foo.getFoo();
		foo.logic();
		
	}
}
