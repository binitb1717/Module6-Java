package com.JavaAsssignment;

import java.util.ArrayList;
import java.util.Iterator;

/*
WAP to iterate through all elements in an array list. 
*/

public class Ques19 {
public static void main(String[] args) {
	
	ArrayList a1 = new ArrayList();
	
	System.out.println(" Default size is: "+a1.size());
	a1.add("Hello");
	a1.add(250);
	a1.add(12.45);
	a1.add('K');
	
	
	Iterator i1 = a1.iterator();
	while (i1.hasNext()) {
	System.out.println(i1.next());	
	}
	


}
}
