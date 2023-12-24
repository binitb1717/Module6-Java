package com.JavaAsssignment;

import java.util.ArrayList;

/*
WAP to update specific array element by given element
*/


public class Ques20 {
public static void main(String[] args) {
	
	ArrayList a1 = new ArrayList();
	
	a1.add("Binit");
	a1.add(123);
	a1.add('Y');
	
	System.out.println("Before updation: "+a1);
	
	a1.set(0,"Nitin");
	
	
	System.out.println("After updating: "+a1);
	
}
}
