package com.day4.session1.doubts;

public class TestLib {
	
	public static void main(String[] args) {
		Library library=new Library("book lib shimla", "mall road");
		library.addBook(new Book(12, "tourist places in shimla", 400, 20));
		library.addBook(new Book(120, "head first", 600, 200));
		
		library.printLibDetails();
	}

}
