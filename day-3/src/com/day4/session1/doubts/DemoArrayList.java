package com.day4.session1.doubts;
import java.util.Collections;
// it contain collection api "readymade ds"
import java.util.LinkedList;
public class DemoArrayList {
	
	public static void main(String[] args) {
		//ArrayList vs LinkedList
		
		
		//generics: java 1.5 : it provide type safty to the data stru , template class of c++
		
		LinkedList<String> l= new LinkedList<String>();//internally is a growable array
	
		l.add("raj");
		l.add("pooja");
		l.add("ekta");
		l.add("gunika");
		
		//just print all the arraylist in one go
		System.out.println(l);
		
		//enhace for loop
//		for(String data: l) {
//			System.out.println(data);
//		}
		
		//data stru= data + algo + container
		
		//sorted result
		Collections.sort(l);
		System.out.println(l);
		
		
		
		
		//iterator design pattern*
		
		//java 8 stream programming sy*
		
	}

}
