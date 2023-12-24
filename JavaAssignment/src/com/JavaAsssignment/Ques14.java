package com.JavaAsssignment;

import java.util.Scanner;

/* Assignment_question14
WAP to concatenate a string to the end of another string..
*/

public class Ques14 {
public static void main(String[] args) {
	
	String m1;
	String m2;
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" String 1 Value is ");
	m1 = sc.nextLine();
	
	System.out.println(" "+" String 2 value is ");
	m2 = sc.nextLine();
	
	
	System.out.println(m1.concat(m2));
}
}
