package com.JavaAsssignment;

import java.util.Scanner;

/* Assignment_question9
WAP to compute the sum values of an array.
*/
public class Ques9 {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	int[] a = new int[3];
	int k = 0;
	for (int i = 0; i < a.length; i++) {
		System.out.println(" Enter number to be added: ");
		a[i]=sc.nextInt();
	}
	
	
	
	for (int i = 0; i < a.length; i++) {
		k = k+a[i];
	
	}		
	System.out.println(" Sum of array value is: "+k);	
	

}
}
