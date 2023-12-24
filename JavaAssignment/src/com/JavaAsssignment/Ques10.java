package com.JavaAsssignment;

import java.util.Scanner;


/* Assignment_question10
WAP to calculate the average value of array elements.
*/


public class Ques10 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	int[] a = new int[3];
	int k = 0;
	for (int i = 0; i < a.length; i++) {
		System.out.println(" Enter Number: ");
		a[i]=sc.nextInt();
	}
	
	for (int i = 0; i < a.length; i++) {
		k = k+a[i];
	}
		System.out.println(" Average value of array elements is: "+k/a.length);
	
	
}
}
