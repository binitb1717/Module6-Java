package com.JavaAsssignment;

import java.util.Scanner;

/*
W.A.J.P. which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks
entered
*/



public class Ques26 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your marks: ");
	int n = sc.nextInt();

	
	if (n > 90 && n <= 100) {
		System.out.println("Grade - AA ");
	}else if (n > 80 && n <= 90) {
		System.out.println("Grade - AB ");
	}else if (n > 70 && n <= 80) {
		System.out.println("Grade - BB ");
	}else if (n > 60 && n <= 70) {
		System.out.println("Grade - BC ");
	}else if (n > 50 && n <= 60) {
		System.out.println("Grade - CD ");
	}else if (n > 40 && n <= 50) {
		System.out.println("Grade - DD ");
	}else {
		System.out.println("Grade - ' FAIL !!!' ");
	}
	
	
	
	
	
}
}
