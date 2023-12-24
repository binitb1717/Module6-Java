package com.JavaAsssignment;

import java.util.Scanner;

/* Assignment_question11
WAP to index of an array element.
*/


public class Ques11 {
public static void main(String[] args) {
	
	int [] a = {2,5,9,10,8};
	Scanner sc = new Scanner(System.in);
	int find ;
	int index = -1;
	
	System.out.println("Array element is : ");
	for (int i = 0; i < a.length; i++) 
	{
		System.out.print(a[i]+",");
	}
	System.out.println();
	
	System.out.println("Enter the array element to find index : ");
	find = sc.nextInt();
	
	for (int i = 0; i < a.length; i++)
	{
		if (a[i]==find)
		{
			index = i;
		}
	}
	System.out.println("index number is : "+index);
}
}

