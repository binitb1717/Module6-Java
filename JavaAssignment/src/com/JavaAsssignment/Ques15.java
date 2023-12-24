package com.JavaAsssignment;

import java.util.Scanner;

public class Ques15 {
//Write a program to demonstrate try catch block..
	
	
	
public static void main(String[] args) {

	int a;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Program Initialised");
	try {
	System.out.println("Enter value of a: ");
	a = sc.nextInt();
	System.out.println(a/0);
	} catch (Exception e) {
	System.out.println("Program Exited");	
	}
	
	
	

}
}
