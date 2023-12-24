package com.JavaAsssignment;

import java.util.ArrayList;

/*
WAP to remove the third element from a array list. 
*/

public class Ques21 {
public static void main(String[] args) {
	
	ArrayList a1 = new ArrayList();

	a1.add("ChatGPT");
	a1.add(456);
	a1.add(15.68);
	a1.add('A');
	System.out.println("Before Removing third Element: "+a1);
	
	a1.remove(2);
	
	System.out.println("After removing third Element: "+a1);
	
}
}
