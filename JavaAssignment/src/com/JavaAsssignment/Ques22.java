package com.JavaAsssignment;

import java.util.Scanner;

/*
WAP to Copy one array into another
*/

public class Ques22 {
public static void main(String[] args) {

	
//	By taking Input from user..
	
	int a[] = new int[5];
	int b[] = a;
	
	
	Scanner r = new Scanner(System.in);
	
	System.out.print("Enter value in first Array..");
	
	for (int i = 0; i < a.length; i++) 
	{
		a[i]= r.nextInt();
	}
	
	System.out.print("First Array Elements: ");
	
	for (int i = 0; i < a.length; i++) 
	{
		System.out.print(a[i]+" ");
	}
	
	
	System.out.println();
	
	System.out.print("Second Array Elements: ");
	
	for (int i = 0; i < b.length; i++) 
	{
		System.out.print(b[i]+" ");
	}
	
	
	
//	Without taking input from user..
	
//int [] a = {10,20,30,40,50};
//int [] b = a;
//
//	System.out.println("original Array is: ");
//	
//	for (int i = 0; i < a.length; i++) {
//		System.out.print(a[i]+" ");
//	}
//	
//	System.out.println();
//	System.out.println("Copy Array is: ");
//	for (int i = 0; i < b.length; i++) {
//		System.out.print(b[i]+" ");
//	}
	
}
}
